package com.shiro.test.mvc.service.impl;

import com.shiro.test.mvc.dao.UserDao;
import com.shiro.test.mvc.pojo.User;
import com.shiro.test.mvc.service.UserService;
import com.shiro.test.mvc.util.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User doLogin(String email, String password) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(email,password);
        try {
            //设置cookie
            token.setRememberMe(true);
            subject.login(token);
            User user=getUserByEmail(email);
            Session session=subject.getSession();
            session.setAttribute(Constants.SESSION_USER,user);
            return user;
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
