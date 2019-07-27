package com.shiro.test.mvc.controller;

import com.shiro.test.mvc.pojo.Menu;
import com.shiro.test.mvc.pojo.Role;
import com.shiro.test.mvc.service.MenuService;
import com.shiro.test.mvc.service.RoleService;
import com.shiro.test.mvc.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("role.html")
public class RoleController {

    @Autowired
    private RoleService roleService;
    @Autowired
    private MenuService menuService;

    @RequestMapping(params = "act=list")
    @ResponseBody
    public List<Role> list(){
        return roleService.getRoleList();
    }

    @RequestMapping(params = "act=page")
    public String showPage(){
        return "role_list";
    }
    @RequestMapping(params = "act=go_edit")
    public String goEdit(){
        return "role_edit";
    }

    @RequestMapping(params = "act=edit")
    @ResponseBody
    public Map edit(Role role){
       if(role.getId() == null){
           roleService.addRole(role);
       }else{
           roleService.updateRole(role);
       }
       return MessageUtil.getSuccessMessageMap("操作成功");
    }
    @RequestMapping(params = "act=menuList")
    @ResponseBody
    public List<Menu> menuList(){
        return menuService.getTreeMenu();
    }

    @RequestMapping(params = "act=assign_menu")
    @ResponseBody
    public Map<String,Object> assignMenu(Integer roleId,Integer[] menuIds){
        roleService.addRoleMenu(roleId,menuIds);
        return MessageUtil.getSuccessMessageMap("权限分配成功");
    }

    @RequestMapping(params = "act=get_menu")
    @ResponseBody
    public List<Integer> menuList(Integer roleId){
        return roleService.getRoleMenu(roleId);
    }



}
