package com.shiro.test.mvc.shiroFilter;

import com.shiro.test.mvc.pojo.MenuPermission;
import com.shiro.test.mvc.service.MenuService;
import org.apache.shiro.config.Ini;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.util.StringUtils;
import org.apache.shiro.web.filter.mgt.FilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

public class MyShiroFilterFactoryBean extends ShiroFilterFactoryBean {
    private final String ROLE_STRING="roles[{0}]";
    private String defalutXmlFilterChainDefinitions;
    @Autowired
    private MenuService menuService;
    /**
     * 添加URL验证规则
     * !只有启动时才有效，无法动态维护
     */
    @Override
    public void setFilterChainDefinitions(String definitions) {
        defalutXmlFilterChainDefinitions =definitions;
        Ini ini = new Ini();
        ini.load(definitions);
        Ini.Section section = ini.getSection("urls");
        if (CollectionUtils.isEmpty(section)) {
            section = ini.getSection("");
        }
        //动态权限格式 url，roles[test1,test2]
        List<MenuPermission>  menuPermissions= menuService.getMenuPerms();
        if (menuPermissions!=null){
            for (MenuPermission menuPermission : menuPermissions) {
                List<Integer> roleIds=menuPermission.getRoleIds();
                if(StringUtils.hasLength(menuPermission.getUrl()) && roleIds!=null && roleIds.size()>0){
                    StringBuffer stringBuffer=new StringBuffer();
                    for (Integer roleId : roleIds) {
                        stringBuffer=stringBuffer.append(roleId).append(",");
                    }

                    String str =stringBuffer.substring(0,stringBuffer.length()-1);
                    //shiro不匹配参数
                    //fixme:如何才能进行url参数匹配？
                    section.put(menuPermission.getUrl().substring(0,menuPermission.getUrl().indexOf("?")),MessageFormat.format(ROLE_STRING,str));

                }

            }
        }
        //依次判断，放在最后，所有链接都要登录才能访问
        section.put("/**","authc");
        //section.put("/dotest1.html",MessageFormat.format(ROLE_STRING,"test"));
        //section.put("/dotest2.html",MessageFormat.format(ROLE_STRING,"test,guest"));
        //section.put("/dotest3.html",MessageFormat.format(ROLE_STRING,"admin"));
        this.setFilterChainDefinitionMap(section);
    }
    /**
     * 获取到FilterChainManager，通过setFilterChainDefinitions（）动态添加URL过滤规则
     */
    public synchronized void updateFilterChian(){
        try {
            AbstractShiroFilter shiroFilter= (AbstractShiroFilter) getObject();
            PathMatchingFilterChainResolver pathMatchingFilterChainResolver= (PathMatchingFilterChainResolver) shiroFilter.getFilterChainResolver();
            FilterChainManager manager=pathMatchingFilterChainResolver.getFilterChainManager();
            //清除原来的filter chain
            manager.getChainNames().clear();
            //后期替换defalutXmlFilterChainDefinitions
            //this.setFilterChainDefinitions("/dotest3.html=roles[admin]");
            this.setFilterChainDefinitions(defalutXmlFilterChainDefinitions);
            Map<String, String> chains = getFilterChainDefinitionMap();
            if (!CollectionUtils.isEmpty(chains)) {
                for (Map.Entry<String, String> entry : chains.entrySet()) {
                    String url = entry.getKey();
                    String chainDefinition = entry.getValue();
                    manager.createChain(url, chainDefinition);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
