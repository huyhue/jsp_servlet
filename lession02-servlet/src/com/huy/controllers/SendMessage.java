package com.huy.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/message.html")
public class SendMessage extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Servlet - > JSP : int String Array Class Object
		String msg = "GET duoc goi";
		req.setAttribute("myMSG", msg);  //name : value
		req.getRequestDispatcher("message.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = "GET duoc goi";
		req.setAttribute("myMSG", msg);  //name : value
		req.getRequestDispatcher("message.jsp").forward(req, resp);
	}
}
