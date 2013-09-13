<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer List</title>
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
</head>
<body>

<a href="home" class="btn btn-link">Back</a>

<h3>Customers</h3>
<c:if test="${!empty customerList}">
    <table class="table table-hover">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Telephone</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td>${customer.lastname}, ${customer.firstname} </td>
                <td>${customer.email}</td>
                <td>${customer.telephone}</td>
                <td><a href="delete/${customer.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


</body>
</html>
