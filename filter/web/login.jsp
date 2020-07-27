<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2020/7/8
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
login
<form action="http://localhost:8080/filter/filterServlet" method="get">
   用户名: <input type="text" name="username">
   密码: <input type="password" name="password">
    <input type="submit" >
</form>
</body>
</html>
