package com.huy.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/index.html")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int chieuDai = Integer.parseInt(request.getParameter("txtChieuDai"));
		int chieuRong = Integer.parseInt(request.getParameter("txtChieuRong"));
		int chuVi = (chieuDai + chieuRong) * 2;
		int dienTich = (chieuDai * chieuRong);
		request.setAttribute("d", chieuDai);
		request.setAttribute("r", chieuRong);
		request.setAttribute("cv", chuVi);
		request.setAttribute("dt", dienTich);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
