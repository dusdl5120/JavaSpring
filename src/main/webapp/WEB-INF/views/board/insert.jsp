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
	<form method="post">
		<div class="form-group">
		  <label for="title">제목 :</label>
		  <input type="text" class="form-control" name="title">
		</div>
			
		<div class="form-group">
		  <label for="author">작성자 :</label>
		  <input type="text" class="form-control" name="author">
		</div>
			
		<div class="form-group">
		  <label for="contents">내용 :</label>
		  <textarea class="form-control" rows="5" id="contents"></textarea>
		</div>
		<button type="submit">등록</button>
	</form>
</body>
</html>