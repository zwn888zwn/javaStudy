package com.shiro.test.mvc.controller;

import com.shiro.test.mvc.pojo.Menu;
import com.shiro.test.mvc.pojo.User;
import com.shiro.test.mvc.service.MenuService;
import com.shiro.test.mvc.util.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PageController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("error.html")
    public String error(){
        return "error";
    }

    @RequestMapping("site.html")
    @ResponseBody
    public List<Menu> siteMenu(){
        Session session=SecurityUtils.getSubject().getSession();
        User user= (User) session.getAttribute(Constants.SESSION_USER);
        List<Menu> menuList = menuService.getPermittedMenuByUser(user.getId());
        return menuList;

    }

    /*    @RequestMapping("do{path}.html")
    public String doPath(@PathVariable( name="path") String path, Model model){
        model.addAttribute("path",path);
        return "test";
    }

    @Autowired
    private MyShiroFilterFactoryBean filterFactoryBean;
    @RequestMapping("update.html")
    public String update(){
        filterFactoryBean.updateFilterChian();
        return "index";
    }*/
}
