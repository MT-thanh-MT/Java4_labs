package edu.poly.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

import edu.poly.model.Student;

/**
 * Servlet implementation class RegisterServlet
 */
@MultipartConfig
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			String name = request.getParameter("name");
//			String gender = request.getParameter("gender");
//			String country = request.getParameter("country");
			DateTimeConverter dtc = new DateConverter(new Date());
			dtc.setPattern("dd/MM/yyyy");
			ConvertUtils.register(dtc, Date.class);
			
			
			Student st = new Student();
			BeanUtils.populate(st, request.getParameterMap());
			
			Part part = request.getPart("image");
			
			String realPath = request.getServletContext().getRealPath("/images");
			String filename = Path.of(part.getSubmittedFileName()).getFileName().toString();
			
			if(!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}
			
			part.write(realPath + "/" + filename);
			
			try(PrintWriter out = response.getWriter()){
				out.println("<h1>Name: " + st.getName() + "</h1>");
				out.println("<h1>gender: " + st.getGender() + "</h1>");
				out.println("<h1>country: " + st.getCountry() + "</h1>");
				out.println("<h1>Date of Brith: " + st.getDob() + "</h1>");
				out.println("<img src='images/"+filename+"' width='360' height='480' />");
					
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
