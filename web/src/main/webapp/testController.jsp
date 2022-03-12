<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 預設 get -->
<a href = "java/testController"  target=_blank>找尋 @WebServlet("/java/testController")</a>
<form action="java/testController" method="post">
用post安全 password:<input type="password" name="password">
<input type="submit" value="ok">
</form>
<br>
<form action="java/testController" method="get">
用get不安全 password:<input type="password" name="password">
<input type="submit" value="ok">
</form>
</body>
</html>