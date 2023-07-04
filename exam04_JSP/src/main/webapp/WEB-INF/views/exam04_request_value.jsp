<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <ul>
        <li>아이디 : <%= request.getParameter("userId") %></li>
        <li>이메일 : <%= request.getParameter("email") %></li>
        <li>성별 : <%= request.getParameter("gender") %></li>
        <li>관심사항 :
            <%
                String[] value = request.getParameterValues("interest");

                if (value == null)
                {
                    out.println("none");
                }
                else
                {
                    for(int i = 0; i < value.length; i++)
                    {
                        out.print(value[i] + " ");
                    }
                }
                
            %></li>
        <li>자기소개 : <%= request.getParameter("intro") %></li>
    </ul>

</body>
</html>