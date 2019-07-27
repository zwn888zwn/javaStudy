package com.shiro.test.javase;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class ShiroTest {
    public static void main(String[] args) {
        Factory<SecurityManager> factory=
        new IniSecurityManagerFactory("classpath:shiro-web.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token =new UsernamePasswordToken("root","123456");
        try {
            subject.login(token);
            if(subject.isAuthenticated()){
                System.out.println("登录成功");
                if (subject.hasRole("admin")){
                    System.out.println("是admin角色");
                }else {
                    System.out.println("不是admin角色");
                }
                if(subject.isPermitted("search")){
                    System.out.println("有search权限");
                }else {
                    System.out.println("没有search权限");
                }
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("登陆失败");
        }
    }
}
