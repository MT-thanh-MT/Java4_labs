package com.poly.servlet;

import com.poly.model.User;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet({"/UserServlet"})
public class UserServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> listUser = Arrays.asList(new User[] {
                new User("Username 1", "Password 1", true),
                new User("Username 2", "Password 2", false),
                new User("Username 3", "Password 3", true)
        });
        request.setAttribute("message", "Quản lý người sử dụng!");
        request.setAttribute("form", listUser.get(0));
        request.setAttribute("listUser", listUser);
        request.getRequestDispatcher("/bai2.jsp").forward(request, response);
    }

}