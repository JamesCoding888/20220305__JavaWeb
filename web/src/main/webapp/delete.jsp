<%@page import="model.student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="dao.studentDao"
%>
<%
/*
1.request-->id-->判斷 !="" &&, null
2.delete
*/

String id = request.getParameter("id");
if(id!="" && id != null)
{
	int ID = Integer.parseInt(id);
	new studentDao().delete(ID);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="delete.jsp" method="post">
<table width=500 align=center>
<tr><td>
	id:<input type="text" name="id" size=3>
	
	<input type="submit" value="ok">
</table>
</form>
<hr>
<table  width=500 align=center border=1>
	<tr>
		<td>id<td>名字<td>地址<td>電話
		<%=new studentDao().query() %>
	<tr>
		<td colspan=4 align=center>
		<a href="index.html">home</a>
</table>
</body>
</html>