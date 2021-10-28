<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Mikhail_Makar
  Date: 10/28/2021
  Time: 6:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<b>--%>
<%--Second : ${people[1]}--%>
<%--</b>--%>
<%--Third : ${people[2]}--%>

<%
    List<String> people = (List<String>) request.getAttribute("people");
%>
<br/>
<%
    out.print(people.get(0));
%>
<br/>
<%
    for (String s: people) {
        out.println(s);
    }
%>

</body>
</html>
