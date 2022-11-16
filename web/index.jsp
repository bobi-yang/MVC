

<%--<%@ page import="cn.pzhuweb.proj.User" %>&lt;%&ndash;
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/10/12
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>


<form action="TodoServlet" method="get">
    <table>
        <tr>
            <td>姓名：</td>
            <td><label>
                <input type="text" name="username" />
            </label>
            </td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><label>
                <input type="text" name="age" />
            </label>
        </tr>
        <tr>
            <td>爱好：</td>
            <td><label>
                <input type="checkbox" name="hobby" value="c" />
            </label>c
                <input type="checkbox" name="hobby" value="c++" />c++
                <input type="checkbox" name="hobby" value="java"/>java
                <input type="checkbox" name="hobby" value="python" />python
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登记" />
            </td>
        </tr>
    </table>
</form>
<a href="show.jsp">查看用户登记信息</a>
</body>
</html>
