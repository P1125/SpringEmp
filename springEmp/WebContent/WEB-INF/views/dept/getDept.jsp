<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getDept.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(function(){  // () {}  CHECK
	$("#btnUpd").on("click", function(){
		// 1. location.href = "updateEmp?employee_id=${emp.employee_id}"
		location.assign("updateDept?department_id=${dept.department_id}") //2
	});
});
</script>
</head>
<body>
<h3>부서 상세보기</h3>
	부서사번 : ${dept.department_id}<br>
	부서이름 : ${dept.department_name}<br>
	매니저id : ${dept.manager_id}<br>
	<br>
	<button id="btnUpd">수정</button>
	<a href="deleteDept?department_id=${dept.department_id}">삭제</a>
	<a href="getSearchDept">목록가기</a>
	
</body>
</html>