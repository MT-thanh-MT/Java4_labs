package com.poly.servlet;

import com.poly.model.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet({"/DetailServlet"})
public class DetailServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Item item = new Item("Nokia 2020", "ip13promax.jpg", 500, 0.1);
        request.setAttribute("item", item);
        request.getRequestDispatcher("/bai3.jsp").forward(request, response);
    }

}
