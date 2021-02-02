<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이게 되네</title>
</head>
<body>
	<form action="#" name="member" method="post">
		<p>
			아이디 : <input type="text" name="id">
			<input type="button" value="중복검사">
		</p>
		<p>
			비밀번호 : <input type="text" name="passwd">
		</p>
		<p>
			이름 : <input type="text" name="name">
		</p>
		<p>
			연락처 : 
			<select name = "phone1">
				<option value = "010">010</option>
				<option value = "011">011</option>
				<option value = "016">016</option>
				<option value = "017">017</option>
			</select>-
			<input type="text" maxlength = "4" size = "4" name = "phone2"> -
			<input type="text" maxlength = "4" size = "4" name="phone3">
		</p>
		<p>
			성별 : 남<input type="radio" name="sex" value="Male">
				  여<input type="radio" name="sex" value="FeMale">
		</p>
		<p>
			취미 : 쇼핑<input type="checkbox" name="hobby1">
				  유튜브<input type="checkbox" name="hobby2">
				  모기사냥<input type="checkbox" name="hobby3">
		</p>
		<p>
			출신지 : <select name="city" size = "3" multiple> <!-- 기본적으로 3개는 보이게 한다 -->
				<option value = "서울">서울턱별시</option> <!-- 서버에서 특정값을 받게 하고 싶을 때는 value를 넣어주자 -->
				<option value = "경기">경기도</option>
				<option value = "경상">경상도</option>
				<option value = "전라">전라도</option>
				<option value = "충청">충청도</option>
				<option value = "강원">강원도</option>
				<option value = "제주">제주도</option>
			</select>
			상세
				<select name = "cityDetail" size = "7">
				<optgroup label="서울">서울</optgroup>
					 <option value = "강남">강남구</option>
					 <option value = "서초">서초구</option>
					 <option value = "송파">송파구</option>
				</optgroup>
				<optgroup label="경기">경기도</optgroup>
					 <option value = "성남">성남시</option>
					 <option value = "수원">수원시</option>
				 </optgroup>
				</select>
			<!-- select는 목록이지만 하나 밖에 선택이 안된다 여러개 선택하고 싶으면 multiple을 넣어준다-->
		</p>
		<p>
			<input type="submit" value="제출하기">
			<input type="submit" value="다시쓰기">
		</p>
	</form>
</body>
</html>