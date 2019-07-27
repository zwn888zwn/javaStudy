package com.shiro.test.mvc.service.impl;

import com.shiro.test.mvc.dao.RoleDao;
import com.shiro.test.mvc.pojo.Role;
import com.shiro.test.mvc.service.RoleService;
import com.shiro.test.mvc.shiroFilter.MyShiroFilterFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private MyShiroFilterFactoryBean shiroFilterFactoryBean;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> getRoleList() {
        return roleDao.getRoleList();
    }

    @Override
    public void addRoleMenu(Integer roleId, Integer[] menuIds) {
        roleDao.deleteRoleMenu(roleId);
        Map<String,Integer> param=new HashMap<>();
        param.put("roleId",roleId);
        for (Integer menuId : menuIds) {
            param.put("menuId",menuId);
            roleDao.addRoleMenu(param);
        }
        shiroFilterFactoryBean.updateFilterChian();
    }

    @Override
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    public void updateRole(Role role) {
        roleDao.updateRole(role);
    }

    @Override
    public List<Integer> getRoleMenu(Integer roleId) {
        return roleDao.getRoleMenu(roleId);
    }

    @Override
    public void addUserRole(Integer userId, Integer[] roleIds) {
        roleDao.deleteUserRole(userId);
        Map<String,Integer> param=new HashMap<>();
        param.put("userId",userId);
        for (Integer roleId : roleIds) {
            param.put("roleId",roleId);
            roleDao.addUserRole(param);
        }
        //shiroFilterFactoryBean.updateFilterChian();
    }

    @Override
    public List<Integer> getUserRole(Integer userId) {
        return roleDao.getUserRole(userId);
    }
}
