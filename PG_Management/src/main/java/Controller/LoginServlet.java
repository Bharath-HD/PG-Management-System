package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDAO;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException {
	
	String username=req.getParameter("username");
	String password=req.getParameter("password");
		AdminDAO dao = new AdminDAO();
		boolean valid = dao.validateAdmin(username, password);
		
		if(valid) {
			res.sendRedirect("dashboard.jsp");
		}else {
		    req.setAttribute("error", "Invalid Username or Password");
			req.getRequestDispatcher("login.jsp").forward(req, res);;
			
		}
	}

}
