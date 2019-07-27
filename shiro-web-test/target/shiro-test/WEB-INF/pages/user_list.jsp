<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/22
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table id="user_table">
    <thead>
    <th data-options="field:'id'">ID</th>
    <th data-options="field:'email'">登录邮箱</th>
    <th data-options="field:'realName'">用户名</th>
    </thead>
</table>
<div id="user-tool">
    <a href="#" onclick="doUserAdd()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
    <a href="#" onclick="doUserUpdate()" class="easyui-linkbutton" data-options="iconCls:'icon-save'">修改</a>
    <a href="#" onclick="doRoleAssign()" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">分配角色</a>
</div>
<div id="user-dialog" title="编辑用户" style="width: 300px;height: 400px" class="easyui-dialog" data-options="model:true,closed:true,href:'<%=request.getContextPath()%>/user.html?act=go_edit',footer:'#user-buttons'">

</div>
<div id="user-role-dialog" title="分配角色" style="width: 300px;height: 400px" class="easyui-dialog" data-options="model:true,closed:true,footer:'#user-role-buttons'">
    <ul id="user-role-tree" class="easyui-tree"></ul>
</div>
<div id="user-buttons" style="text-align: right;padding: 0 5px 0 5px">
    <a href="#" onclick="submitEditForm()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">提交</a>
    <a href="#" onclick="dialogClose()" class="easyui-linkbutton">取消</a>
</div>
<div id="user-role-buttons" style="text-align: right;padding: 0 5px 0 5px">
    <a href="#" onclick="submitRoleEditForm()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">提交</a>
    <a href="#" onclick="$('#user-role-dialog').dialog('close');" class="easyui-linkbutton">取消</a>
</div>
<script type="text/javascript">
    $(function () {
        $("#user_table").datagrid({
            url:'<%=request.getContextPath()%>/user.html?act=list',
            singleSelect:true,
            toolbar:"user-tool"
        })
        
        
    })
    function doRoleAssign() {
        var row =$("#user_table").datagrid("getSelected");
        $.ajax({
            url:'<%=request.getContextPath()%>/user.html?act=get_role',
            data:{userId:row['id']},
            method:'post',
            success:function (roleIds) {
                $("#user-role-tree").tree({
                    url:'<%=request.getContextPath()%>/user.html?act=roleList',
                    method:'post',
                    checkbox:true,
                    onLoadSuccess:function (node,data) {
                        for(var i=0;i<roleIds.length;i++){
                            var nodeRole= $("#user-role-tree").tree('find',roleIds[i]);
                            if($("#user-role-tree").tree('isLeaf',nodeRole.target)){
                                $("#user-role-tree").tree('check',nodeRole.target);
                            }

                        }
                        $("#user-role-dialog").dialog('open');
                    }
                })



            }
        })

    }
    function doUserAdd() {
        $("#user-dialog").dialog({
            onLoad:function () {
                $("#user-form").resetForm();
            }
        }).dialog("open");
    }
    function doUserUpdate() {
        var row =$("#user_table").datagrid("getSelected");
        console.log(row);
        if(row==null||row.length===0){
            return;
        }
        $("#user-dialog").dialog({
            onLoad:function () {
                $("#user-form").form("load",{
                    id:row.id,
                    email:row.email,
                    realName:row.realName,
                    password:row.password,
                    status:row.status
                })
            }
        }).dialog("open");
    }
    function dialogClose() {
        $("#user-dialog").dialog("close");
    }
    function submitRoleEditForm() {
        var row =$("#user_table").datagrid("getSelected");
        var roleIds=new Array();
        $($("#user-role-tree").tree("getChecked",['checked','indeterminate'])).each(function (i ,node) {
            roleIds[i]=node["id"];
        })
        $.ajax({
            url:'<%=request.getContextPath()%>/user.html?act=assign_role',
            data:{userId:row['id'],roleIds:roleIds.join(',')},
            method:'post',
            success:function (data) {
                if(data.status){
                    $("#user-role-dialog").dialog("close");
                }else {
                    alert(data.message);
                }
            }
        })
    }
    function submitEditForm() {
       $.ajax({
           url:'<%=request.getContextPath()%>/user.html?act=edit',
           data:$("#user-form").serialize(),
           method:'post',
           success:function (data) {
               if(data.status) {
                    $("#user-dialog").dialog("close");
                    $("#user_table").datagrid("load");
               }else{
                   alert(data.message);
               }
           }
       })
    }
</script>
</body>
</html>
