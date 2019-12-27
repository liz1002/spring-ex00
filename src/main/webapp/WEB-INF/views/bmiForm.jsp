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
	input[name="calc"]{
		margin: 10px;
	}
	.error{
		color: red;
		display: none;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(function() {
		$("form").submit(function() {
			var result = 0;
			$(".error").css("display", "none");
			
			$("input[name]").each(function(i, obj) {
				if($(obj).val() == ""){
					result++;
					$(obj).next().css("display", "inline");
				}				
			})
			if(result > 0){
				return false;
			}
		})
	})
</script>
</head>
<body>
	<form action="bmi" method="post">
		<fieldset>
			<legend>비만도 테스트</legend>
			<p>
				<label>이름 | </label>
				<input type="text" name="name">
				<span class="error">이름을 입력하세요.</span>
			</p>
			<p>
				<label>키 | </label>
				<input type="number" name="height">
				<span class="error">키를 입력하세요.</span>
			</p>
			<p>
				<label>몸무게 | </label>
				<input type="number" name="weight">
				<span class="error">몸무게를 입력하세요.</span>
			</p>
			<p>
				<label>취미1 | </label>
				<input type="text" name="hobbys">
				<span class="error">취미를 입력하세요.</span>
			</p>
			<p>
				<label>취미2 | </label>
				<input type="text" name="hobbys">
				<span class="error">취미를 입력하세요.</span>
			</p>
			<p>
				<label>취미3 | </label>
				<input type="text" name="hobbys">
				<span class="error">취미를 입력하세요.</span>
			</p>
			<p>
				<input type="submit" value="결과">
			</p>
		</fieldset>
	</form>
</body>
</html>