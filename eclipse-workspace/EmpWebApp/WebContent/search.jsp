<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.Employee_info" scope="request"></jsp:useBean>
<body>
<a href='./home'>Home</a>
<a style='float:right' href='./logout'>Logout</a>
<fieldset>
<% if(info!=null) { %>
<legend>Employee info</legend>
<table align="center">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
</tr>
<tr>
<td><%=info.getId()%></td>
<td><%=info.getName()%></td>
<td><%=info.getEmail()%></td>
</tr>
</table>
<% } %>
<%else{ %>
<h1>no data found</h1> 
<%} %>

</fieldset>
</body>
</html>