package com.shiro.test.mvc.dao;

import com.shiro.test.mvc.pojo.Menu;
import com.shiro.test.mvc.pojo.MenuPermission;

import java.util.List;

public interface MenuDao {

    List<Menu> getAllMenu();

    List<MenuPermission> getMenuPerms();

    List<Menu> getPermittedMenuByUser(Integer userId);
}
