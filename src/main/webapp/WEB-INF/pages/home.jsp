<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Manager</title>
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
</head>
<body>

<h2>Welcome to Customer manager</h2>

<div style="padding: 25px">
    <a href="add" class="btn btn-primary">Add Customer</a>
    <a href="list" class="btn btn-success">View Customers</a>
</div>
</body>
</html>
