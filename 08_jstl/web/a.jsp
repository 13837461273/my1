<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2020/6/21
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${requestScope.abc}
<c:set scope="request" var="abc" value="123"></c:set>
${requestScope.abc}
<hr><table><c:forEach begin="1" end="10" var="i"><tr><td>${ i }</td><td>${ i }</td><td>行</td><tr></c:forEach></table>
<% Map<String,Object> map = new HashMap<>();

    map.put("key1","value1");
    map.put("key2","value2");
    map.put("key3","value3");
    request.setAttribute("map",map);
%>
<c:forEach items="${requestScope.map}" var="entry">${entry}<br></c:forEach>
    </body>
</html>
