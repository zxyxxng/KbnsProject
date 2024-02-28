<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Home Sample View</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>카드번호</th>
        <th>회원번호</th>
        <th>카드일련코드</th>
        <th>카드구분코드</th>
        <th>카드브랜드코드</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="info" items="${list}" varStatus="status">
            <td><c:out value="${info}"></c:out></td>
        </c:forEach>

    </tr>
    </tbody>
</table>
</body>
</html>