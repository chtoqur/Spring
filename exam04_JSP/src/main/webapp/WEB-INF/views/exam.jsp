<!-- cf. %@ : 메타정보 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- JSP : HTML 내부에 자바 소스를 넣어서 사용 가능함 -->
<!-- 이 때 자바코드는 변수의 선언부, expression, statement에 들어갈 수 있는데
     각각의 코드가 들어가는 방식과 위치가 상이하다 -->

<!-- 1. %! : 선언부
    변수가 정의되는 부분 -->
<%!
String str1 = "Exam";
String str2 = "jsp";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exam</title>
</head>
<body>
    <h1>Exam.jsp</h1>
    <!-- 2. %= : expression -->
    <!-- expression(O), statement(X) -->
    <h1><%= str1 %></h1>
    <h1><%= str2 %></h1>
    <h1><%= str1 + "." + str2 %></h1>

    <p>
        <!-- 3. % : statement -->
        <%
        out.println(str1 + "." + str2 + "파일 입니다.");
        %>
    </p>

</body>
</html>