<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Manager</title>
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
    <style>
        .error {
            color: #ee0d25;
        }
    </style>

</head>
<body>

<a href="home" class="btn btn-link">Back</a>

<h2>Customer Manager</h2>
<form:form method="post" action="add" commandName="customer" class="form-horizontal">
    <fieldset>
        <legend>Customer Details</legend>
        <div class="form-group">
            <form:label class="col-lg-2 control-label" path="firstname">
                <spring:message code="label.firstname"/>
            </form:label>
            <div class="col-sm-3">
                <form:input path="firstname" placeholder="Firstname" cssClass="form-control"/>
            </div>
            <form:errors path="firstname" cssClass="error"/>
        </div>

        <div class="form-group">
            <form:label class="col-lg-2 control-label" path="lastname">
                <spring:message code="label.lastname"/>
            </form:label>
            <div class="col-sm-3">
                <form:input path="lastname" placeholder="LastName" cssClass="form-control"/>
            </div>
            <form:errors path="lastname" cssClass="error"/>
        </div>
        <legend>Contact Details</legend>
        <div class="form-group">
            <form:label class="col-lg-2 control-label" path="email">
                <spring:message code="label.email"/>
            </form:label>
            <div class="col-md-3">
                <form:input path="email" placeholder="email" cssClass="form-control"/>
            </div>
            <form:errors path="email" cssClass="error"/>
        </div>
        <div class="form-group">
            <form:label class="col-lg-2 control-label" path="telephone">
                <spring:message code="label.telephone"/>
            </form:label>
            <div class="col-lg-3">
                <form:input path="telephone" placeholder="telephone" cssClass="form-control"/>
            </div>
            <form:errors path="telephone" cssClass="error"/>
        </div>
    </fieldset>
    <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
            <button type="submit" class="btn btn-primary"><spring:message code="label.addcustomer"/></button>
        </div>
    </div>
</form:form>

</body>
</html>
