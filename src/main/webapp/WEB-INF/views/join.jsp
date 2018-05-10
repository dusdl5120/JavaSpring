<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
      <div>
		<form method="post">
			<div>
				<label for="user_name">이름</label> 
				<input type="text" name="name" required />
			</div> <br />
			
			<div>
				<label for="user_id">아이디</label> 
				<input type="text" name="id" required/>
			</div> <br />
			
			<div>
				<label for="user_passwd">비밀번호</label> 
				<input type="password" name="passwd" required/>
			</div> <br />
			
			<div>
				<label for="user_email">이메일</label> 
				<input type="email" name="email" />
			</div> <br />
			
			<button type="submit">회원가입</button>
		</form>
	</div>
    
</body>
</html>