package com.shiro.test.mvc.dao;

import com.shiro.test.mvc.pojo.User;

import java.util.List;

public interface UserDao {
    User getUserByEmail(String email);
    List<User> getUserList();
    void addUser(User user);
    void updateUser(User user);

}
