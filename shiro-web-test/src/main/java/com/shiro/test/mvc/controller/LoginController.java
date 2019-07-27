package com.shiro.test.mvc.controller;

import com.shiro.test.mvc.pojo.User;
import com.shiro.test.mvc.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("gologin.html")
    public String gologin() {
        return "login";
    }

    @RequestMapping("logout.html")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    @RequestMapping("login.html")
    public String login(String email, String password, HttpServletRequest req) {

        User user = userService.doLogin(email, password);
        if (user == null) {
            req.setAttribute("error", "用户名或密码错误");
            return "login";
        }
        return "redirect:index.html";


    }
}
