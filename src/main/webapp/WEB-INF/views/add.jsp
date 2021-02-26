<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<title>Add City</title>
<body>
	<h2>Add City </h2>
	<c:if test="${not empty msg}">
        ${msg}
    </c:if>
	<h3>Add User</h3>
	<form method="POST" name="add_country"
		action="<%=request.getContextPath()%>/add/country">
		City: <input name="city" value="${city}" type="text" /> <br /> <br />
		Country: <input name="country" value="${country}" type="text" />
		<br /> <br />
		<input value="Add Country" type="submit" />
	</form>
</body>
</html>