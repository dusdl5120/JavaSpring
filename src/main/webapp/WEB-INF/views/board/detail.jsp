<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row "> 
			<h3 class="offset-2 col-8">상세정보</h3>
		</div>
		<form method="post">
			<input type="hidden" name="number" value="${detail.number }" />
			<div class="row">		
				<div class="offset-2 col-8">
					<div class="form-group" >
			  			<label for="usr">제목:</label>
			  			<input type="text" class="form-control" id="usr" name="title" value="${detail.title }">
					</div>
				</div>
				<div class="offset-2 col-8">
					<div class="form-group">
			  			<label for="pwd">작성자:</label>
			  			<input type="text" class="form-control" id="pwd" name="author" value="${detail.author }">
					</div>
				</div>
				<div class="offset-2 col-8">
					<div class="form-group">
		  				<label for="comment">내용:</label>
		  				<textarea class="form-control" rows="6" id="comment" name="contents">${detail.contents }</textarea>
		  				
					</div>
				</div>
				<div class="offset-2 col-8">
					<button type="button" class="btn btn-primary" onclick="location.href='/board/list'">목록</button>
					<button type="submit" class="btn btn-info">수정</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
