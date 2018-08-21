<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dto.KakeiboDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
%>
<form action="/kadai/Show_Servlet" method="get">
	<h3>収入</h3><input type="text" name="keyN">
	<h3>支出</h3><input type="text" name="shisyutsu">
	<h3>利用日</h3><input type="text" name="riyoubi">
	<input type="submit" value="登録"></form>
</body>
</html>