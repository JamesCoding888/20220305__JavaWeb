<%@page import="model.student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="dao.studentDao"
    import="model.student"%>
<%
/*
1.request-->id,name,chi,eng,sum-->null, ""
2.queryId(id)--->s-->改
3.update(s)
*/
String id = request.getParameter("id");
if(id!=null && id!="")
{
	int getOfUpdateId=Integer.parseInt(id);
	student s=(student)new studentDao().queryId(getOfUpdateId);
	String name=request.getParameter("name");
	String chi=request.getParameter("chi");
	String eng=request.getParameter("eng");
	String sum=request.getParameter("sum");
	
	s.setName(name);
	s.setChi(chi);
	s.setEng(eng);
	s.setSum(sum);	
	new studentDao().update(s);
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
<table width=500 align=center>
<tr><td>
	id:<input type="text" name="id" size=3>
	name:<input type="text" name="name" size=5>
	chi:<input type="text" name="chi" size=5>
	eng:<input type="text" name="eng" size=5>
	sum:<input type="text" name="sum" size=5>
	<input type="submit" value="ok">
</table>
</form>
<hr>
<table  width=500 align=center border=1>
	<tr>
		<tr><td>id<td>名字<td>chinese<td>english<td>sum
		<%=new studentDao().query() %>
	<tr>
		<td colspan=4 align=center>
		<a href="index2.html">home page</a>
</table>
</body>
</html>