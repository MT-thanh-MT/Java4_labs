package edu.poly.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class chuNhatServlet
 */
@WebServlet("/chuNhatServlet")
public class chuNhatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/formHinhChuNhat.jsp");

		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/formHinhChuNhat.jsp");
		
		float a = Float.parseFloat(request.getParameter("a"));
		float b = Float.parseFloat(request.getParameter("b"));
		float cv = tinhCV(a,b);
		float dt = tinhDT(a,b);
		request.setAttribute("dienTich", "Dien tich cua hinh chu nhat la: " + dt);
		request.setAttribute("chuVi", "Chu vi cua hinh chu nhat la: " + cv);
		request.setAttribute("a", a);
		request.setAttribute("b", b);
		rd.forward(request, response);
	}

	private float tinhCV(float a, float b) {
		
		return a*b;
	}

	private float tinhDT(float a, float b) {
		
		return (a+b)*2;
	}

}
