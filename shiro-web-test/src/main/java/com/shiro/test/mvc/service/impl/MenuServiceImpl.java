package com.shiro.test.mvc.service.impl;

import com.shiro.test.mvc.dao.MenuDao;
import com.shiro.test.mvc.pojo.Menu;
import com.shiro.test.mvc.pojo.MenuPermission;
import com.shiro.test.mvc.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;

    private List<Menu> makeMenu(List<Menu> menuList){
        Map<Integer,Menu> menuMap=new HashMap<>(menuList.size());
        List<Menu> parentMenu=new ArrayList<>();
        for (Menu menu : menuList) {
            menuMap.put(menu.getId(),menu);
            if(menu.getParentId()==null || menu.getParentId()<1){
                parentMenu.add(menu);
            }
        }
        for (Menu menu : menuList) {
            if(menu.getParentId()!=null){
                Menu parent=menuMap.get(menu.getParentId());
                if(parent!=null){
                    parent.getChildren().add(menu);
                }

            }
        }

        return parentMenu;
    }

    @Override
    public List<Menu> getTreeMenu() {
        List<Menu> menus=menuDao.getAllMenu();
        return makeMenu(menus);
    }

    @Override
    public List<MenuPermission> getMenuPerms() {
        return menuDao.getMenuPerms();
    }

    @Override
    public List<Menu> getPermittedMenuByUser(Integer userId) {
        List<Menu> menus= menuDao.getPermittedMenuByUser(userId);
        return makeMenu(menus);
    }
}
