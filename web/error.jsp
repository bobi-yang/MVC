<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/10/27
  Time: 0:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>错误提示</title>
</head>
<body>
<%
    if( session.getAttribute("error")!=null){
        out.print((String) session.getAttribute("error"));
        request.getSession().removeAttribute("error");
    }
    if( session.getAttribute("age")!=null){
        out.print((String) session.getAttribute("age"));
        session.removeAttribute("age");
    }
    if(session.getAttribute("hobby")!=null){
        out.print((String) session.getAttribute("hobby"));
        session.removeAttribute("hobby");
    }
    if(session.getAttribute("username")!=null){
        out.print((String) session.getAttribute("username"));
        session.removeAttribute("username");
    }
   response.setHeader("refresh", "3;url=index.jsp");//进行3s后自动刷新到登录页面
%>
</body>
</html>
