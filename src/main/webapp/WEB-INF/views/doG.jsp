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
	<h1>doG : List&lt;MemberVO&gt; 값 전달</h1>
	<c:forEach var="member" items="${list}">
		<p>userid : ${member.userid} | userpw : ${member.userpw}</p>
	</c:forEach>
</body>
</html>