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
<table id="role_table">
    <thead>
    <th data-options="field:'id'">ID</th>
    <th data-options="field:'name'">角色</th>
    <th data-options="field:'remark'">备注</th>
    </thead>
</table>
<div id="role-tool">
    <a href="#" onclick="doRoleAdd()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
    <a href="#" onclick="doRoleUpdate()" class="easyui-linkbutton" data-options="iconCls:'icon-save'">修改</a>
    <a href="#" onclick="doMenuAssign()" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">分配权限</a>
</div>
<div id="role-dialog" title="编辑角色" style="width: 300px;height: 400px" class="easyui-dialog" data-options="model:true,closed:true,href:'<%=request.getContextPath()%>/role.html?act=go_edit',footer:'#role-buttons'">

</div>
<div id="role-menu-dialog" title="分配角色" style="width: 300px;height: 400px" class="easyui-dialog" data-options="model:true,closed:true,footer:'#role-menu-buttons'">
    <ul id="role-menu-tree" class="easyui-tree"></ul>
</div>
<div id="role-buttons" style="text-align: right;padding: 0 5px 0 5px">
    <a href="#" onclick="submitEditForm()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">提交</a>
    <a href="#" onclick="dialogClose()" class="easyui-linkbutton">取消</a>
</div>
<div id="role-menu-buttons" style="text-align: right;padding: 0 5px 0 5px">
    <a href="#" onclick="submitMenuEditForm()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">提交</a>
    <a href="#" onclick="$('#role-menu-dialog').dialog('close');" class="easyui-linkbutton">取消</a>
</div>
<script type="text/javascript">
    $(function () {
        $("#role_table").datagrid({
            url:'<%=request.getContextPath()%>/role.html?act=list',
            singleSelect:true,
            toolbar:"role-tool"
        })
        
        
    })
    function doMenuAssign() {
        var row =$("#role_table").datagrid("getSelected");
        $.ajax({
            url:'<%=request.getContextPath()%>/role.html?act=get_menu',
            data:{roleId:row['id']},
            method:'post',
            success:function (menuIds) {
                $("#role-menu-tree").tree({
                    url:'<%=request.getContextPath()%>/role.html?act=menuList',
                    method:'post',
                    checkbox:true,
                    onLoadSuccess:function (node,data) {
                        for(var i=0;i<menuIds.length;i++){
                            var nodeMenu= $("#role-menu-tree").tree('find',menuIds[i]);
                            if($("#role-menu-tree").tree('isLeaf',nodeMenu.target)){
                                $("#role-menu-tree").tree('check',nodeMenu.target);
                            }

                        }
                        $("#role-menu-dialog").dialog('open');
                    }
                })



            }
        })

    }
    function doRoleAdd() {
        $("#role-dialog").dialog("open");
    }
    function doRoleUpdate() {
        var row =$("#role_table").datagrid("getSelected");
        console.log(row);
        if(row==null||row.length===0){
            return;
        }
        $("#role-dialog").dialog({
            onLoad:function () {
                $("#role-form").form("load",{
                    id:row.id,
                    name:row.name,
                    remark:row.remark,
                    status:row.status
                })
            }
        }).dialog("open");
    }
    function dialogClose() {
        $("#role-dialog").dialog("close");
    }
    function submitMenuEditForm() {
        var row =$("#role_table").datagrid("getSelected");
        var menuIds=new Array();
        $($("#role-menu-tree").tree("getChecked",['checked','indeterminate'])).each(function (i ,node) {
            menuIds[i]=node["id"];
        })
        $.ajax({
            url:'<%=request.getContextPath()%>/role.html?act=assign_menu',
            data:{roleId:row['id'],menuIds:menuIds.join(',')},
            method:'post',
            success:function (data) {
                if(data.status){
                    $("#role-menu-dialog").dialog("close");
                }else {
                    alert(data.message);
                }
            }
        })
    }
    function submitEditForm() {
       $.ajax({
           url:'<%=request.getContextPath()%>/role.html?act=edit',
           data:$("#role-form").serialize(),
           method:'post',
           success:function (data) {
               if(data.status) {
                    $("#role-dialog").dialog("close");
                    $("#role_table").datagrid("load");
               }else{
                   alert(data.message);
               }
           }
       })
    }
</script>
</body>
</html>
