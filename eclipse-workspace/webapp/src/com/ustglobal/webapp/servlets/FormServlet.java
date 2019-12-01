package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service-method");
		System.out.println("extra line of code");
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-Name");

		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-Name");


		String useremail =req.getParameter("useremail");
		String password =req.getParameter("password");
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		out.println("<h1>");
		out.println(useremail);
		out.println("</h1>");

		out.println("<h1>");
		out.println(password);
		out.println("</h1>");
		out.println("<h1>");
		out.println(companyName);
		out.println("</h1>");
		out.println("<h1>");
		out.println(batchName);
		out.println("</h1>");

		out.println("</html>");
		out.println("</body>");
	}//end of doGet
}//end of form 
