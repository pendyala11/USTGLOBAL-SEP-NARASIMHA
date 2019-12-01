package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.html")
public class LoginpageServlet extends HomeServlet{
              @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            	   PrintWriter out = resp.getWriter();
            	   String id="";
            	   Cookie[] cookies = req.getCookies();
            	   if(cookies!=null) {
            	   for(Cookie cookie :cookies)
            	   {
            		   if(cookie.getName().equals("rememberme"))
            		   {
            			   id=cookie.getValue();
            		   }
            			  
            	   }
            	   
            	   }
            	   out.println("<html>");
            	   out.println("<fieldset align='center'>");
            	   out.println("<form action='./login' method='post'>");
            	   out.println("<table>");
            	   out.println("  <tr>");
            	   out.println(" <td>Id</td>");
            	   out.println("<td> <input type='number' name='id' value='"+id+"'> </td>");
            	   out.println("</tr>");
            	   out.println("  <tr>");
            	   out.println(" <td>password</td>");
            	   out.println("<td> <input type='password' name='password'> </td>");
            	   out.println("</tr>");
            	   out.println("<tr>");
            	   out.println("<td><input type='checkbox' name='rememberme' value='checked'</td>");
            	   out.println("<td>rememberme</td>");
            	   out.println("</tr>");
            	   out.println("<tr>");
            	   out.println("<td><input type='reset' name='Reset'></td>");
            	   out.println("<td><input type='submit' value='login'> </td>");
            	   out.println("</tr>");
            	   out.println("<a href='./register.html'>Register</a>");
            	   out.println("</table>");
            	   out.println("</form>");
            	   out.println("</fieldset>");
            	   out.println("</html>");
            	
            	   
            }//doGet
}// END OF LoginpageServlet
