package com.shiro.test.mvc.controller;

import com.shiro.test.mvc.pojo.Role;
import com.shiro.test.mvc.pojo.User;
import com.shiro.test.mvc.service.RoleService;
import com.shiro.test.mvc.service.UserService;
import com.shiro.test.mvc.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user.html")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    @RequestMapping(params = "act=page")
    public String showPage(){
        return "user_list";
    }

    @RequestMapping(params = "act=list")
    @ResponseBody
    public List<User> list(){
        return userService.getUserList();
    }

    @RequestMapping(params = "act=go_edit")
    public String goEdit(){
        return "user_edit";
    }

    @RequestMapping(params = "act=edit")
    @ResponseBody
    public Map edit(User user){
        if(user.getId() == null){
            userService.addUser(user);
        }else{
            userService.updateUser(user);
        }
        return MessageUtil.getSuccessMessageMap("操作成功");
    }

    @RequestMapping(params = "act=roleList")
    @ResponseBody
    public List<Map<String,Object>> roleList(){
        List<Role> list=roleService.getRoleList();
        List<Map<String,Object>> jsonList=new ArrayList<>();
        Map<String,Object> param=null;
        for (Role role : list) {
            param=new HashMap<>();
            param.put("id",role.getId());
            param.put("text",role.getName()+"["+role.getRemark()+"]");
            jsonList.add(param);
        }
        return jsonList;
    }

    @RequestMapping(params = "act=assign_role")
    @ResponseBody
    public Map<String,Object> assignRole(Integer userId,Integer[] roleIds){
        roleService.addUserRole(userId,roleIds);
        return MessageUtil.getSuccessMessageMap("角色分配成功");
    }

    //查询已有角色
    @RequestMapping(params = "act=get_role")
    @ResponseBody
    public List<Integer> menuList(Integer userId){
        return roleService.getUserRole(userId);
    }

}
