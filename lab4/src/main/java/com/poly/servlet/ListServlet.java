package com.poly.servlet;

import com.poly.model.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet({"/ListServlet"})
public class ListServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Item> items = Arrays.asList(new Item[] {
                new Item("Nokia 2020", "nokia.jpg", 500, 0.1),
                new Item("Samsung Xyz", "samsung.jpg", 700, 0.15),
                new Item("iPhone 13 promax", "ip13promax.jpg", 900, 0.25),
                new Item("Sony Erricson", "sony.jpg", 55, 0.3),
                new Item("Seamen", "seamen.jpg", 70, 0.5),
                new Item("Oppo 2021", "oppo.jpg", 200, 0.2)
        });
        request.setAttribute("items", items);
        request.getRequestDispatcher("/bai4.jsp").forward(request, response);
    }

}
