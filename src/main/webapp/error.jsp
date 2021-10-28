<%--
  Created by IntelliJ IDEA.
  User: Mikhail_Makar
  Date: 10/27/2021
  Time: 8:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String message = pageContext.getException().getMessage();
    String exception = pageContext.getException().getClass().toString();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Exception</h2>
<p>Exception type: <%= exception%></p>
<p>Exception message: <%= message%></p>
</body>
</html>
