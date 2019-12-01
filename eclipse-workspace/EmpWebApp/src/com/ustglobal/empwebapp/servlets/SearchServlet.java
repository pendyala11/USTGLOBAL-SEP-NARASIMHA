package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.Employee_info;
import com.ustglobal.empwebapp.util.EmployeeDAOManager;
@WebServlet("/search")
public class SearchServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session == null)
		{
			RequestDispatcher dispatcher =req.getRequestDispatcher("/login.html");
			dispatcher.forward(req, resp);

		}
		else
		{
			int id = Integer.parseInt(req.getParameter("id"));
			EmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
			Employee_info info =dao.searchEmployee(id);
//			req.setAttribute("info", info);
//			RequestDispatcher dispatcher =req.getRequestDispatcher("/search.jsp");
//			dispatcher.forward(req, resp);
			
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<a href='./home'>Home</a>");
			out.println("<a style='float:right' href='./logout'>Logout</a>");
			if(info!=null) {
				out.println("<table align='center' border='3px' bordercollapse:collapsed padding:10px margin:10px >");
				out.println("<tr>");
				out.println("<th>Id</th><th>Name</th><th>Email</th>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>");
				out.println(info.getId());
				out.println("</td>");
				out.println("<td>");
				out.println(info.getName());
				out.println("</td>");
				out.println("<td>");
				out.println(info.getEmail());
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("</html>");
				out.println("</body>");
			}
			else {
				out.println("<h4>No Data Found </h4>");
			}

		}
	}// end of doGet
}//end of SearchServlet
