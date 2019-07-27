<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/18
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/login.html" method="post">
    用户名： <input type="text" name="email" value="${email}"><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit" value="登录"> ${error}<br/>
</form>
</body>
</html>
