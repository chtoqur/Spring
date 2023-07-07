<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exam05_Response</title>
</head>
<body>
    <h1>Exam05_Response.jsp</h1>

    <form action="/exam05_response_info" method="post">
        <fieldset>
            <label for="userId">아이디 : </label>
            <input type="text" id="userId" name="userId" placeholder="아이디를 입력하세요.">
            <br><label for="userPw">비밀번호 : </label>
            <input type="password" id="userPw" name="userPw">
            <input type="submit" value="LOGIN">
        </fieldset>
    </form>
</body>
</html>