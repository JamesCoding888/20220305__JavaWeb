<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@page import = "dao.studentDao" %> 
<%
/*
1. 先判斷 request --> id
2. new id --> 如果沒有 --> null
3. 按下 Ok 按鈕 --> 沒輸入任何 id 數值 --> 給空字串 "" --> 並執行 query()
4. 按下 Ok 按鈕 --> 有輸入 id 數值 --> 執行 queryId()  

*/

String id = request.getParameter("id");
String show="";

if(id==null || id==""){
	show = new studentDao().query();
} else{
	int getIdOfQueryId_jsp = Integer.parseInt(id);
	show = new studentDao().query(getIdOfQueryId_jsp);
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="queryId.jsp" method="post">
	<table width=500 align=center>
		<tr><td>
			Id: <input type="text" name="id">
			<input type = "submit" value = "Ok">
	</table>
</form>
<hr>
<table width=500 align=center border=1>
<tr><td>id<td>名字<td>chinese<td>english<td>sum
	<%=show %>
</table>
	
</body>
</html>