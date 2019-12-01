package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String search= req.getParameter("search");
		String engine= req.getParameter("select");
		if (engine.equals("Bing")) {
			resp.sendRedirect("https://www.Bing.com/search?q="+search);
		}
		else if(engine.equals("Google")){
			resp.sendRedirect("https://www.Google.com/search?q="+search);
		}
		else {
			resp.sendRedirect("https://in.search.Yahoo.com/search?q="+search);
		}


	}

}
