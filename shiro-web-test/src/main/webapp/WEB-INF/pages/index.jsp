<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/18
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/icon.css">
    <script type="text/javascript" src="../../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyui/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height: 50px">
    <a href="/logout.html">退出登录</a>
</div>
<div data-options="region:'west'" title="菜单" style="width: 10%">
    <ul class="easyui-tree" id="listMenu">
<%--        <li>
            <span>系统功能</span>
            <ul>
                <shiro:hasPermission name="menu:list">
                    <li data-options="url:'/menu/list.html'">
                        <span>菜单管理</span>
                    </li>
                </shiro:hasPermission>
                &lt;%&ndash;<shiro:hasRole name="admin">&ndash;%&gt;
                    <li data-options="url:'/role.html?act=page'">
                        <span>角色管理</span>
                    </li>
                &lt;%&ndash;</shiro:hasRole>&ndash;%&gt;

                <li data-options="url:'/user.html?act=page'">
                    <span>用户管理</span>
                </li>
            </ul>
        </li>--%>

    </ul>
</div>
<div data-options="region:'center'" title="首页">
    <div id="tabs" class="easyui-tabs"></div>
</div>
<script type="text/javascript">
    $(function () {
        $("#listMenu").tree({
            url:'<%=request.getContextPath()%>/site.html',
            onClick: function (node) {
                if ($("#leftMenu").tree("isLeaf", node.target)) {
                    var $tabs = $("#tabs");
                    var tab = $tabs.tabs("getTab", node.text);
                    if (tab) {
                        $tabs.tabs("select",node.text);

                    } else {
                        $tabs.tabs("add", {
                            title: node.text,
                            href: node.url,
                            closable: true
                        })
                    }
                }
            }
        })
    })
</script>
</body>
</html>
