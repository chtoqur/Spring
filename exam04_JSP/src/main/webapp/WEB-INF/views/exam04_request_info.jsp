<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exam04_request_info</title>
</head>
<body>
    <h1>Exam04_request_info.jsp</h1>

    <ul>
        일반정보<br>
        <li>데이터 전송 메소드 : <%= request.getMethod() %></li>
        <!-- 전체 -->
        <li>URL : <%= request.getRequestURL() %></li>
        <!-- URL 중 리소스만 -->
        <li>URI : <%= request.getRequestURI() %></li>
        <li>프로토콜 : <%= request.getProtocol() %></li>
        <li>서버명 : <%= request.getServerName() %></li>
        <li>서버포트 : <%= request.getServerPort() %></li>

        <br>

        중요정보<br>
        <li>클라이언트 IP : <%= request.getRemoteAddr() %></li>
        <li>클라이언트 Port : <%= request.getRemotePort() %></li>
        <li>Query-String : <%= request.getQueryString() %></li>
        <li>Param1 : <%= request.getParameter("eng") %></li>
        <li>Param2 : <%= request.getParameter("ko") %></li>

        <br>
        Request 헤더정보<br>
        <%
        String headerName = "";           // 헤더이름
        String headerValue = "";          // 헤더의 값
        Enumeration headers = request.getHeaderNames();

        while(headers.hasMoreElements())
        {
            headerName = (String)headers.nextElement();
            headerValue = request.getHeader(headerName);

            out.println(headerName + " : " + headerValue + "<br>");
        }
        %>
    </ul>

</body>
</html>