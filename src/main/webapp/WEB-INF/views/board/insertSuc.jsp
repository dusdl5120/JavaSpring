<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title></title>

</head>
<body>
      <table class="table table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>내용</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${number }</td>
					<td>${title }</td>
					<td>${author }</td>
					<td>${contents }</td>
				</tr>
			</tbody>
		</table>
      <button type="button" class="btn btn-primary" onclick="location.href='/board/list'">목록으로</button>
    
</body>
</html>