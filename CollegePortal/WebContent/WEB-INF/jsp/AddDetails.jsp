<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	<%@ taglib uri= "http://www.springframework.org/tags/form" prefix= "form" %>
	
</head>
<body>

	<form:form method= "post" action= "first.htm">
	
		<label>StudentId</label>
		<form:input path="studentId"/>
		
		<label>StudentName</label>
		<form:input path="studentName"/>
		
		<label>academicScore</label>
		<form:input path="academicScore"/>
		
		<label>sportsScore</label>
		<form:input path="sportsScore"/>
		
		<label>culturalScore</label>
		<form:input path="culturalScore"/>
		
	<input type= "submit" value= "submit">
	</form:form>

</body>
</html>