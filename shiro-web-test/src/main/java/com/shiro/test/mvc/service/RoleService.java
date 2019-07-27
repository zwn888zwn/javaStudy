package com.shiro.test.mvc.service;

import com.shiro.test.mvc.pojo.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRoleList();
    void addRole(Role role);
    void updateRole(Role role);
    void addRoleMenu(Integer roleId,Integer[] menuIds);
    void addUserRole(Integer userId,Integer[] roleIds);
    List<Integer> getRoleMenu(Integer roleId);
    List<Integer> getUserRole(Integer userId);
}
