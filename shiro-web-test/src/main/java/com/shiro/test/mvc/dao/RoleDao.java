package com.shiro.test.mvc.dao;

import com.shiro.test.mvc.pojo.Role;

import java.util.List;
import java.util.Map;

public interface RoleDao {
    List<Role> getRoleList();
    void addRole(Role role);
    void updateRole(Role role);
    void addRoleMenu(Map roleMap);
    void deleteRoleMenu(Integer roleId);
    List<Integer> getRoleMenu(Integer roleId);
    void addUserRole(Map roleMap);
    void deleteUserRole(Integer roleId);
    List<Integer> getUserRole(Integer userId);
}
