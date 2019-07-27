package com.shiro.test.mvc.shiroFilter;

import com.shiro.test.mvc.pojo.User;
import com.shiro.test.mvc.service.RoleService;
import com.shiro.test.mvc.service.UserService;
import com.shiro.test.mvc.util.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //每次访问都执行本方法，大量访问数据库，需要添加缓存
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("权限验证");
        // 角色添加 1.获取用户 2 查找角色 3在authorization中添加角色
        Subject subject=SecurityUtils.getSubject();
        Session session=subject.getSession();
        User user= (User) session.getAttribute(Constants.SESSION_USER);
        List<Integer> roleIds= roleService.getUserRole(user.getId());
        if(roleIds!=null && roleIds.size()>0){
            SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
            for (Integer roleId : roleIds) {
                simpleAuthorizationInfo.addRole(roleId.toString());
            }
            return simpleAuthorizationInfo;
        }
        return null;
    }
    //登录执行
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String email= (String) authenticationToken.getPrincipal();
        User user = userService.getUserByEmail(email);
        if (user!=null){
            return new SimpleAuthenticationInfo(email,user.getPassword(),null,getName());
        }
        return null;
    }
}
