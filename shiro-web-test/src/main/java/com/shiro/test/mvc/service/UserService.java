package com.shiro.test.mvc.service;

import com.shiro.test.mvc.pojo.User;

import java.util.List;

public interface UserService {
    User doLogin(String email,String password);
    User getUserByEmail(String email);
    List<User> getUserList();
    void addUser(User user);
    void updateUser(User user);
}
