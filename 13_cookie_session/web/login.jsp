<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/13_cookie_session/loginServlet" method="get">
用户名:    <input type="text" name="username" value="${cookie.username.value}">
密码:    <input type="password" name="password" value="">
    <input type="submit" value="登录">
</form>
</body>
</html>