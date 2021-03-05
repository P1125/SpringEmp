<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertDept.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<h3 id="top">붓등록</h3>
	<form:form modelAttribute="deptVO" action="insertDept" method="post" name="frm">
		department_id <form:input path="department_id" /><br>
		department_name <form:input path="department_name" /><br>
		manager_id<form:input  path="manager_id" /><br> 
		location_id<form:input path="location_id" /><br>
				
		<button type="button" id="DeptSearch">부서검색</button><br>
		<button type="submit">등록</button>
		<button type="reset">취소</button>
		<a href="getSearchDept">목록가기</a>

	</form:form>
</body>
</html>