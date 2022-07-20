package edu.poly.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadCookieServlet
 */
@WebServlet("/ReadCookieServlet")
public class ReadCookieServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cks = request.getCookies();
		
		try(PrintWriter out = response.getWriter()){
			if (cks != null) {
				for (int i = 0; i < cks.length; i++) {
					Cookie cookie = cks[i];
					
					out.println("Name: "+ cookie.getName() + ": value: "+ cookie.getValue());
					
				}
			}
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
