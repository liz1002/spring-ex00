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
	<h3>결과</h3>
	<c:choose>
		<c:when test="${calc == 'add'}">
			<p>${num1} + ${num2} = ${num1 + num2}</p>		
		</c:when>
		<c:when test="${calc == 'sub'}">
			<p>${num1} - ${num2} = ${num1 - num2}</p>		
		</c:when>
		<c:when test="${calc == 'mul'}">
			<p>${num1} * ${num2} = ${num1 * num2}</p>		
		</c:when>
		<c:when test="${calc == 'div'}">
			<p>${num1} / ${num2} = ${num1 / num2}</p>		
		</c:when>
	</c:choose>
</body>
</html>   