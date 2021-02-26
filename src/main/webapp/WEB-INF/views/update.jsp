<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<title>Update</title>
<body>
	<h2>Update</h2>
	<c:if test="${not empty msg}">
        ${msg}
    </c:if>
	<h3>Update City</h3>
	<form method="POST" name="update_country"
		action="<%=request.getContextPath()%>/update/country">
		<input hidden="hidden" name="id" value="${id}" type="text" /> City: <input
			name="city" value="${country.city}" type="text" /> <br /> <br />
		Country: <input name="country" value="${country.country}"
			type="text" /> <br /> <br /> <input value="Update City"
			type="submit" />
	</form>
</body>
</html>