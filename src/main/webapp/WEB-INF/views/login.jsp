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
<h1 style="text-align: center; color: green;">로그인 </h1>
	<div>
		<form method="post" class="offset-3 col-6">
			<div class="form-group">
			  <label for="id">ID :</label>
			  <input type="text" class="form-control" name="id" >
			</div>
			<div class="form-group">
			  <label for="passwd">Password :</label>
			  <input type="password" class="form-control" name="passwd">
			</div>
			
			<button type="submit" class="btn btn-success col-5" style="margin-left: 50px;">로그인</button>
			<button type="submit" class="btn btn-success col-5" style="margin-left: 30px;">로그인</button>
		</form>
	</div>
    
</body>
</html>