package edu.ycp.cs320.lab02a_ssanjuan1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doGet");
		
		req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
		
		if(req.getParameter("adding") != null) {
			req.getRequestDispatcher("/_view/addNumbers.jsp").forward(req, resp);
		}
		else if(req.getParameter("multiply") != null) {
			req.getRequestDispatcher("/_view/multiplyNumbers.jsp").forward(req, resp);
		}
		else if(req.getParameter("startGame") != null) {
			req.getRequestDispatcher("/_view/guessingGame.jsp").forward(req, resp);
		}
	}
}
