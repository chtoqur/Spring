<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
    <h1>login.jsp</h1>
    <!-- ID, PW 입력창 -->
    <!-- 버튼을 누르면 로그인 쪽으로 넘어갈 수 있도록..? -->

    <form action="/login" method="post">
        <fieldset><legend>로그인</legend>
        <label for="userId">아이디</label> : <input type="text" name="userId" id="userId"><br>
        <label for="userPw">비밀번호</label> : <input type="password" name="userPw" id="userPw">
        <input type="submit" value="전송">
        </fieldset>
    </form>
</body>
</html>