<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.util.Date" %>
<%@page import = "controller.school" %>

<!-- java 底下 經過編譯後，轉 Servlet -->     
<%!
int a=10;
int abc(int z,int y)
{
	return z*y;
}
//System.out.println(abc(10,20));

%>

<%
out.print(abc(10,20));
int x=10;
int y=20;
System.out.println(x+y);
out.print("x+y="+(x+y)+"<br>");//PrintWrite out=response.getWrite();
out.println(Math.abs(-10)+"<br>");
out.println(new Date());
out.println(school.cal2(5,3)+"<br>");
out.println(new school().cal(5, 10)+"<br>");
%>

<!-- HTML 底下 -->
<!DOCTYPE html><!--  -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
x+y=<%=x+y %>
<%@include file ="end.jsp" %>
</body>
</html>