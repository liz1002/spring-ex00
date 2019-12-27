<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>비만도 테스트 결과</h3>
	<p><span>이름 | </span>${myInfo.name}</p>
	<p><span>키 | </span>${myInfo.height}</p>
	<p><span>몸무게 | </span>${myInfo.weight}</p>
	<c:forEach var="hobby" items="${myInfo.hobbys}">
		<p><span>취미 | </span>${hobby}</p>
	</c:forEach>
	<p><span>비만도 | </span>${myInfo.bmiCalculator.bmiCalculator(myInfo.weight, myInfo.height)}</p>
</body>
</html>  