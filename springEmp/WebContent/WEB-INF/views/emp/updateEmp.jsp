<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<h3 id="top">사원수정</h3>
	<form action="updateEmp" method="post" name="frm">
		employee_id <input type="number" name="employee_id" value="${empVO.employee_id}"
			<c:if test="${not empty empVO.employee_id}">readonly="readonly"</c:if>><br>

		first_name <input name="first_name" value="${empVO.first_name }"><br>
		last_name <input name="last_name" value="${empVO.last_name }"><br>
		 email <input type="email" name="email" value="${empVO.email }">
		<!--이메일중복체크 -->
		<button type="button" id="btnEmail">중복체크</button>
		<span id="emailResult"></span> 
		<br> phone_number<input type="text" name="phone_number" value="${empVO.phone_number}"><br>
		 hire_date <input type="date" name="hire_date" value="${empVO.hire_date}"><br> 
		 job_id <select name="job_id">
			<c:forEach var="job" items="${jobList}">
				<option value="${empVO.job_id}" selected="selected">${job.job_title}
			</c:forEach>
		</select>					<!-- Should be thrown in the value -->
		<br> department_id			<input type="radio" name="department_id" value="10">ㄱㄱ 
		<c:forEach var="dept" items="${deptList}">
			<input type="radio" name="department_id" value="10"
				<c:if test="${dept.department_id == empVO.department_id}">
			 checked="checked"</c:if>>
		 ${dept.department_name}
		</c:forEach>
		job_id <select name="job_id">
					<option value="AC_ACCOUNT">Accounting Manager></option>
					<c:forEach items="${jobList}" var="job">
						<option value="${job.job_id}" selected="selected">
					</c:forEach>
				</select>
		<br> manager_id <input type="text" name="manager_id" value="${empVO.manager_id}"> 
						<input type="text" value="">

		<button type="button" id="empSearch">사원검색</button><br>
		<button type="submit">등록</button>
		<button type="reset">취소</button>
		<a href="getSearchEmp">목록가기</a>

	</form>
</body>
</html>