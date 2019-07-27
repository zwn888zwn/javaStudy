package com.shiro.test.mvc.pojo;

import java.util.List;

/*一个菜单对应一个url，
一个URL对应多个角色*/
public class MenuPermission {
    private Integer menuId;
    private String url;
    private List<Integer> roleIds;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }
}
