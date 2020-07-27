<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2020/6/23
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
pageContext.setAttribute("basePath",basePath);
%>
<%=basePath%>


<base href="<%=basePath%>"/>
<link type="text/css" rel="stylesheet" href="static/css/style.css" >
<script type="text/javascript" src="static/jquery-1.7.2.js"></script>
