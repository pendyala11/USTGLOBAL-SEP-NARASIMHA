<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String id="";
Cookie[] cookies = request.getCookies();
if(cookies!=null) {
for(Cookie cookie :cookies)
{
	   if(cookie.getName().equals("rememberme"))
	   {
		   id=cookie.getValue();
	   }
		  
}

}


%>
<body>
<fieldset align='center'>
<form action='./login' method='post'>

<table>
  <tr>
    <td>Id</td>
    <td> <input type='number' name='id'> </td>
  </tr>
  <tr>
    <td>password</td>
    <td><input type='password' name='password'></td>
  </tr>
  <tr>
    <td> <input type='checkbox' name='rememberme' value='checked'> </td>
    <td>Remember me</td>
  </tr>
   <tr>
   <td><input type='reset' name='Reset'></td>
   <td><input type='submit' value='login'> </td>
   </tr>
  <a href='./register.html'>Register</a>
</table>
</form>
</fieldset>
</body>
</html>