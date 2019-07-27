
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form id="user-form">
    <input name="id" type="hidden"/>
    <table>
        <tr>
            <td>用户名</td>
            <td><input name="realName" type="text"/></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input name="email" type="text"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input name="password" type="text"/></td>
        </tr>
        <tr>
            <td>状态</td>
            <td>
                <select name="status">
                    <option value="1">有效</option>
                    <option value="0">无效</option>
                </select>
            </td>
        </tr>
    </table>
</form>