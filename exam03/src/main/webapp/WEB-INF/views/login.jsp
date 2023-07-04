<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h1>Login</h1>
<!-- 묶여있어야 전송할 수 있기 때문에 form 태그 사용 -->
<form action="/login" method="post">
    <fieldset>
        <label for="userId">ID : </label>
        <input type="text" id="userId" name="userId" placeholder="아이디를 입력하세요.">
        <br><label for="userPw">PW : </label>
        <input type="password" id="userPw" name="userPw">
        <input type="submit" value="LOGIN">
    </fieldset>
</form>
</body>
</html>