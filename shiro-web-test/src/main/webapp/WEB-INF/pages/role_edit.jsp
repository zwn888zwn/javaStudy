
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form id="role-form">
    <input name="id" type="hidden"/>
    <table>
        <tr>
            <td>角色名</td>
            <td><input name="name" type="text"/></td>
        </tr>
        <tr>
            <td>备注</td>
            <td><input name="remark" type="text"/></td>
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