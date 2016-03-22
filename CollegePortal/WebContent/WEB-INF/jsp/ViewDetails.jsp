<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
		<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

</head>
<body>

	<h1>Department Details</h1>
	<c:forEach items="${deptList}" var="item">
		<spring:url value="/record/${item.departmentName}" var= "url" htmlEscape= "true"></spring:url>
		<a href="${url}"><c:out value="${item.departmentName }"/></a>
		
		<c:out value="${item.departmentHead }"></c:out>
		<br>
	</c:forEach>
</body>
</html>

