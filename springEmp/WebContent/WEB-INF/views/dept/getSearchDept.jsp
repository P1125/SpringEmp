<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getSearchDept.jsp</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h3>부서목록</h3>
	<c:forEach items="${list }" var="dept">
	<div class="row">
		부서번호 : <a href="getDept?department_id=${dept.department_id}"> ${dept.department_id}</a>
		/ 부서이름 :<a href="getDept?department_id=${dept.department_name}"> ${dept.department_name} </a>
		/ 매니저id : ${dept.manager_id}
		/ 지역 : ${dept.city }	
		 
	</div>	
	</c:forEach>
	<a href="insertDept">등록</a>
	<a href="../spring/">메인</a>
</body>
</html>