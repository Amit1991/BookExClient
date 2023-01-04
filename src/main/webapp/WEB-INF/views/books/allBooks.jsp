<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--
  Created by IntelliJ IDEA.
  User: amitb
  Date: 03-01-2023
  Time: 09:20 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>All Books</title>
    <jsp:include page="../../resources/cssSetup.jsp" />
</head>
<body>
    <table>
        <thead>
            <tr>
                <th><spring:message code="book.id" /></th>
                <th><spring:message code="book.title" /></th>
                <th><spring:message code="book.isbn10" /></th>
                <th><spring:message code="book.isbn13" /></th>
                <th><spring:message code="book.year" /></th>
                <th><spring:message code="book.edition" /></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${allBooks}" var="book" varStatus="index">
                <tr>
                    <td>${index.index+1}</td>
                    <td>${book.title}</td>
                    <td>${book.isbn10}</td>
                    <td>${book.isbn13}</td>
                    <td>${book.publishingYear}</td>
                    <td>${book.edition}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
