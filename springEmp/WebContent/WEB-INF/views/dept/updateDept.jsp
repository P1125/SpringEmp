<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateEmp.jsp</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function() {
		$("deptSearch").on("click", function() {
			window.open('deptSearch', '부서검색', 'width=700px, height=800px');
		});

	});
</script>
</head>
<body>
	<h3 id="top">부서수정</h3>
	<form action="updateDept" method="post" name="frm">
		dept_id <input type="number" name="department_id"
			value="${deptVO.department_id}"
			<c:if test="${not empty deptVO.department_id}">readonly="readonly"</c:if>><br>

		<br> department_name <input type="text" name="department_name"
			value="${deptVO.department_name}"> <br> 
			manager_id 
			<input type="text" name="manager_id" value="${deptVO.manager_id}">

		<button type="button" id="deptSearch">부서검색</button><br>
		<button type="submit">등록</button>
		<button type="reset">취소</button>
		<a href="getSearchDept">목록가기</a>
	</form>
</body>
</html>