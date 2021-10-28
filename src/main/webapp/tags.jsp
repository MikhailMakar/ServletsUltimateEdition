<%--
  Created by IntelliJ IDEA.
  User: Mikhail_Makar
  Date: 10/28/2021
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String[] strings = new String[]{"One", "Two", "Where is your car, Dude?!"};
    request.setAttribute("strings", strings);
%>
<body>

<c:forEach var="string" items="${strings}">
    <c:if test="${string.length() > 8}">
        ${string} is too long
    </c:if>
    <li>
        ${string}
    </li>
</c:forEach>

<br/>
<br/>

<c:forTokens items="John, David, Ivan, Pasha" delims="," var="name">
    <li>
        ${name}
    </li>
</c:forTokens>

<br/>

<c:forEach var="string" items="${strings}">
    <c:choose>
        <c:when test="${string.length() > 10}"> ${string} : long string <br/></c:when>
        <c:otherwise>${string} : short string <br/></c:otherwise>
    </c:choose>
</c:forEach>

<br/>

<%
    String[] tagTypes = new String[]{"for", "if", "person", "import", "tags"};
    request.setAttribute("urls", tagTypes);
%>

<c:forEach var="url" items="${urls}">
    <li>
        <a href="<c:url value='${url}.jsp'/>">${url}</a>
    </li>
</c:forEach>

</body>
</html>
