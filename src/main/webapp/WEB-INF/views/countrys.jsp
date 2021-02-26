<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<title>Spring Boot MVC and Hibernate CRUD Example</title>
<body>
	<a href="<%=request.getContextPath()%>/addCountry">Add</a>
	<c:if test="${not empty msg}">
        ${msg}
    </c:if>
	<c:choose>
		<c:when test="${countrys != null}">
			<h3>List of Citys</h3>
			<table cellpadding="5" cellspacing="5">
				<thead>
					<tr>
						<th>ID</th>
						<th>City</th>
						<th>Country</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="t" items="${countrys}">
						<tr>
							<td>${t.id}</td>
							<td>${t.city}</td>
							<td>${t.country}</td>
							<td><a
								href="<%=request.getContextPath()%>/country/${t.id}">Details</a>
								&nbsp;<a
								href="<%=request.getContextPath()%>/update/country/${t.id}">Update</a>
								&nbsp; <a
								href="<%=request.getContextPath()%>/delete/country/${t.id}"
								onclick="return confirm('Do you really want to delete?')">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:when>
		<c:otherwise>
        No User found in the DB!
        </c:otherwise>
	</c:choose>
</body>
</html>