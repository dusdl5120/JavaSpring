<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>sign up</title>
</head>
<body>
	<form method="post" action="">				<!-- 이때 method=post는 Controller에서 post메소드로 가라 -->
		<fieldset style="text-align: left;">
			<legend>회원가입</legend>
				<div>
					<label for="userId">아이디</label>
					<input type="text" name="id" placeholder="ID를 입력하세요" required value="${id}">		<!-- 페이지에 있는 값을 가져오려면 name을 써주면 되고 -->
				</div><br />															   					<!-- 컨트롤러에서 매개변수를 적어주면 됨 -->
				<div>
					<label for="passwd">비밀번호</label>
					<input type="password" name="passwd" placeholder="비밀번호를 입력하세요" required value="${passwd}">
				</div><br />
				<div>
					<label for="email">이메일주소</label>
					<input type="email" name="email" size="35" placeholder="이메일주소를 입력하세요" value="${email}">
				</div><br />
				<div>
					<label for="phoneNum">휴대폰번호</label>
					<select name="phone1">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="016">016</option>
						<option value="017">017</option>
						<option value="018">018</option>
						<option value="019">019</option>
					</select> - 
					<input type="text" name="phone2" size="10"> - 
					<input type="text" name="phone3"size="10">
				</div><br />
				<div>
					<label for="birth">생년월일</label>
					<select name="birth1">
						<option value="1980">1980</option>
						<option value="1981">1981</option>
						<option value="1982">1982</option>
						<option value="1983">1983</option>
						<option value="1984">1984</option>
						<option value="1985">1985</option>
						<option value="1986">1986</option>
						<option value="1987">1987</option>
						<option value="1988">1988</option>
						<option value="1989">1989</option>
						<option value="1990">1990</option>
						<option value="1991">1991</option>
						<option value="1992">1992</option>
					</select>년
					<select name="birth2">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
					</select>월
					<select name="birth3">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="16">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
					</select>월
				</div><br />
				<button type="submit">가입하기</button>
				<button type="button">취소하기</button>
				<a href="/">홈으로</a>
		</fieldset>
	</form>
</body>
</html>
