<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	form{
		width: 500px;
		margin: 20px auto;
	}
	label {
		width: 80px;
		float: left;
		text-align: right;
		margin-right: 10px;
	}
</style>
</head>
<body>
	<form action="join" method="post">
		<fieldset>
			<legend>회원가입</legend>
			<p>
				<label>이름 | </label>
				<input type="text" name="name">
			</p>
			<p>
				<label>비밀번호 | </label>
				<input type="text" name="pass">
			</p>
			<p>
				<input type="submit" value="회원가입">
			</p>
		</fieldset>
	</form>
</body>
</html>