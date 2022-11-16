<%@page import="cn.pzhuweb.proj.userInfo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>dengji</title>
</head>
<body>
<h1>登记成功</h1>
姓名：${userinfo.username}<br/>
年龄：${userinfo.age}<br/>
爱好：<c:forEach items = "${userinfo.hobby}" var="x">
${x}
</c:forEach>
<%--爱好：${userinfo.toString()}<br/>--%>
<a href="show.jsp">查看所有用户信息</a>

</body>
</html>