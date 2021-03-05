<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateEmp.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(function(){
	//이메일 중복체크 json
	$("#btnEmail").on("click", function(){
		$.ajax({
				url : "EmailCheck",
				data : "email="+$("[name=email]").val(), //서버에보낼 파라미터  param값 넣기
				dataType : "xml", 	//결과 타입 json -> xml
				success : function(response){ //인수로넘어온다
			/*	json
				$("#emailResult").html(response.email); //인수값출력
				if( response.email == true){
					#("#emailResult").html("<font color='blue'>사용가능</font>");
				}else
					#("#emailResult").html("<font color='red'>사용불가능</font>");
			} */
			// xml
					$("#emailResult").html( $(response).find("email").text() );
		}
		})
	});
		$("#empSearch").on("click", function(){
			window.open('empSearch', '사원검색', 'width=700px, height=800px');
		});
});

</script>
</head>
<body>
	<h3 id="top">사원등록</h3>
	<form:form modelAttribute="empVO" action="insertEmp" method="post" name="frm">
		employee_id <form:input path="employee_id" /><br>

		first_name 	<form:input path="first_name" /><br>
		last_name 	<form:input path="last_name" /><br>
		email 		<form:input path="email"/>
					<form:button type="button" id="btnEmail">중복체크</form:button>
					<span id="emailResult"></span><br> 
		phone_number<form:input type="text" path="phone_number" /><br>
		hire_date 	<form:input type="date" path="hire_date"/><br> 
		department_id<form:radiobuttons  items="${deptList}" 
										 path="department_id"
										 itemLabel="department_name" 
										 itemValue="department_id"/><br> 
		job_id <form:select path="job_id">
					<option value="AC_ACCOUNT">AC_ACCOUNT</option>
					<form:options items="${jobList}" itemLabel="job_title" itemValue="AC_ACCOUNT" /> <!--itemValue="job_id"  -->
				</form:select><br>
				
		manager_id 
		<form:input  path="manager_id"/> 

		<button type="button" id="empSearch">사원검색</button><br>
		<button type="submit">등록</button>
		<button type="reset">취소</button>
		<a href="getSearchEmp">목록가기</a>

	</form:form>
</body>
</html>