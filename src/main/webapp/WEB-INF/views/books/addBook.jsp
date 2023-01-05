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
    <form:form action="addBookPost" modelAttribute="book" >
        <spring:message code="book.id" />
        <form:input path="id" />
        <form:errors path="id" />
        <br />
        <spring:message code="book.title" />
        <form:input path="title" />
        <form:errors path="title" />
        <br />
        <spring:message code="book.isbn10" />
        <form:input path="isbn10" />
        <form:errors path="isbn10" />
        <br />
        <spring:message code="book.isbn13" /><form:input path="isbn13" />
        <form:errors path="isbn13" />
        <br />
        <spring:message code="book.year" />
        <form:input path="publishingYear" />
        <form:errors path="publishingYear" />
        <br />
        <spring:message code="book.edition" />
        <form:input path="edition" />
        <form:errors path="edition" />
        <br />
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
