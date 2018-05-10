<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<div>
	
		<div>
			<a href="/login">로그인</a>		
		</div>
		
		<div>
			<a href="/join">회원가입</a>
		</div>
		
	</div>

</body>
</html>

<!-- <img src="/resources/images/genie.png"> -->  <!-- 이미지파일은 webapp - resources - images - png파일 -->		
<!-- 이미지 파일은 무조건 절대경로로 해주는게 좋음. servlet-context.xml에서 css, js, img파일은 resources폴더에 넣어놓고 불러들이도록 설정해놨기 때문임 -->