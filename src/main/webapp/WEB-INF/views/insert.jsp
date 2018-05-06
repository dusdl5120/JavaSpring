<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title></title>

</head>
<body>
	<div>
		<form method="post">
			<div>
				<label for="user_name">이름</label> 
				<input type="text" name="name" />
			</div> <br />
			
			<div>
				<label for="user_score">점수</label> 
				<input type="text" name="score" />점
			</div> <br />
			
			<div>
				<label for="user_age">나이</label> 
				<input type="text" name="age" />세
			</div> <br />
			
			<button type="submit">등록</button>
			<button type="button">취소</button>
		</form>
	</div>
    
</body>
</html>