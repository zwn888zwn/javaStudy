package com.shiro.test.mvc.service;

import com.shiro.test.mvc.pojo.Menu;
import com.shiro.test.mvc.pojo.MenuPermission;

import java.util.List;

public interface MenuService {
    List<Menu> getTreeMenu();
    List<MenuPermission> getMenuPerms();
    List<Menu> getPermittedMenuByUser(Integer userId);
}
