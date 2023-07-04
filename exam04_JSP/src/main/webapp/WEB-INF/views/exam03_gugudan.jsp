<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exam_gugudan</title>
</head>
<body>
    <!-- 선언부라는 것은 클래스의 선언부를 의미함.
    함수 안에서 쓰는 지역 변수는 구태여 선언부에 선언할 필요 없음 -->
    
    <h1>Exam03_gugudan.jsp</h1>

    <%
    try
    {
        int dan = Integer.parseInt(request.getParameter("dan"));
        int mul = 1;

        if ((dan < 2) || (dan > 9))
        {
            out.println("dan 값이 잘못되었습니다.");
            return;
        }
        out.println("<p>");
        for (int i = 0; i < 9; i++)
        {
            out.println(dan + " X " + mul + " = " + (dan * mul) + "<br>");
            mul++;
        }
        out.println("</p>");
    }
    catch(Exception e)
    {
        out.println("잘못된 파라미터 값입니다.");
    }
    %>

</body>
</html>