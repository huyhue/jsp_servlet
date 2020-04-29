package ducky.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class HelloWorld
 */
//@WebServlet(description = "This is a demo", urlPatterns = { "/helloWorld" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		loadParameter(request, response, "by Get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		loadParameter(request, response, "by Post");
	}
	
	private void loadParameter(HttpServletRequest request, HttpServletResponse response, String method) throws IOException {
		
		ServletContext content = this.getServletContext(); //duy nhat 1 doi tuong
//		this.getServletConfig().getServletContext(); //c2
		String account = content.getInitParameter("account");
		String pass = content.getInitParameter("pass");
		
		ServletConfig config = this.getServletConfig();
		String song = config.getInitParameter("song");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter writer = response.getWriter();
		writer.println("Hello World " + method + "</br>");
		writer.println("Username " + username + " has " + password + "</br>");
		
		writer.println("The song is: " + song + "</br>");
		
		writer.println("Account: " + account + " - Pass: " + pass);
	}


}