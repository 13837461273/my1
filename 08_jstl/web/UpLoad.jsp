<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2020/6/21
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/08_jstl_war_exploded/uploadServlet" enctype="multipart/form-data" method="post">
用户名:<input type="text" name="username"> <br>
    头像:<input type="file" name="photo"> <br>
    <input type="submit" value="上传">
</form>
</body>
</html>
