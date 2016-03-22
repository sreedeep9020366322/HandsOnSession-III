<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<%@ taglib uri= "http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	
</head>
<body>

	<c:forEach items="studentList" ></c:forEach>
	<c:out value="${studentList.get(0).getStudentName() }"></c:out>
	<c:out value="${studentList.get{0).academicScore()*.5 +  studentList.get{0).sportsScore()*.3 + studentList.get{0).culturalScore()*.2}"></c:out>

</body>
</html>