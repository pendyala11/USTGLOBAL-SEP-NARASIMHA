<%@page import="com.ustglobal.webapp1.beans.Retailer"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% Retailer bean = (Retailer)session.getAttribute("bean");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">ChangePassword</a>
	<a href="./searchProducts">SearchProducts</a>
	
	<a href="./logout" style="float: right"> Logout</a>
	<h2>
		welcome
		<%=bean.getName()%>
	</h2>
	<fieldset>
		<legend>Search Product</legend>
		<form action="./search">
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%Retailer retailer =(Retailer)request.getAttribute("bean"); %>
	<%if(retailer!=null){ %>
	<table align="center" border="5px">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>DOJ</th>
		</tr>
		<tr>
			<td><%=retailer.getId()%></td>
			<td><%=retailer.getName()%></td>
			<td><%=retailer.getEmail()%></td>
			<td><%=retailer.getPassword()%></td>
		</tr>
	</table>
	<%} %>
	<h3>${msg}</h3>
</body>
</html>