<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/11/2
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户查询</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/jdbc2" method="post">
    姓名：<input type="text" name="username">
    <input type="submit">
</form>
</body>
</html>
