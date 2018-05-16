<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title></title>

</head>
<body>
	<div class="form-group">
	  <label for="title">제목 :</label>
	  <input value="${board.title }" class="form-control" name="title" >
	</div>
		
	<div class="form-group">
	  <label for="author">작성자 :</label>
	  <input value="${author }" class="form-control" name="author">
	</div>
		
	<div class="form-group">
	  <label for="contents">내용 :</label>
	  <textarea value="${contents }" class="form-control" rows="5" id="contents"></textarea>
	</div>
	<button type="submit">등록</button>
   
</body>
</html>