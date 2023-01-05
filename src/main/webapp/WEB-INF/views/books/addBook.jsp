<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: amitb
  Date: 04-01-2023
  Time: 08:46 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
    <jsp:include page="../../resources/cssSetup.jsp" />
</head>
<body>
    <%--@elvariable id="book" type="com.bookex.client.model.Book"--%>
    <form:form method="post" action="addBook" modelAttribute="book">
        <spring:message code="book.id" /><form:input path="id" />
    </form:form>
</body>
</html>
