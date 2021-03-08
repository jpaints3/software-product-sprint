package com.google.sps.servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/strservlet")
public class StringServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;");
        response.getWriter().println("<p>hello world</p>");
    }
}