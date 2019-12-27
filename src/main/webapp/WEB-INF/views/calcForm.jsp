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
			
			if($("input[type='radio']:checked").length == 0){
				alert("사칙연산을 선택하세요");
				return false;
			}else if(result > 0){
				return false;
			}
		})
	})
</script>
</head>
<body>
	<form action="calc" method="post">
		<fieldset>
			<legend>계산기</legend>
			<p>
				<label>숫자1 | </label>
				<input type="number" name="num2">
				<span class="error">숫자를 입력하세요.</span>
			</p>
			<p>
				<label>숫자2 | </label>
				<input type="number" name="num1">
				<span class="error">숫자를 입력하세요.</span>
			</p>
			<p>
				<input type="radio" value="add" name="calc">더하기
				<input type="radio" value="sub" name="calc">빼기
				<input type="radio" value="mul" name="calc">곱하기
				<input type="radio" value="div" name="calc">나누기
				<input type="submit" value="계산">
			</p>
		</fieldset>
	</form>
</body>
</html>