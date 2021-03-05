<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>insertOrder.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(function(){
	$('.slide_gallery').bxSlider({
		auto:true,
		autoControls: false,
		pagerCustom: '.slider-pager'
	});
});
</script>
</head>
<body>
<!-- $("tr:last").clone().appendTo($("tbody")); -->
<button type="button">상품추가</button>	
	<form action="insertOrder" method="post">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input nmae="name" /></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input nmae="tel" /></td>
			</tr>
			<tr>
				<td>배송지</td>
				<td><input nmae="addr" /></td>
			</tr>
			<tr>
				<td><input nmae="ords[0].no" /></td>
				<td><input nmae="ords[0].cnt" /></td>
			</tr>
			<tr>
				<td><input nmae="ords[1].no" /></td>
				<td><input nmae="ords[1].cnt" /></td>
			</tr>
			<tr>
				<td><input nmae="ords[2].no" /></td>
				<td><input nmae="ords[2].cnt" /></td>
			</tr>
		</table>
		<button>주문하기</button>
	</form>
<a href="../spring/">목록가기</a>
</body>
</html>