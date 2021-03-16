package com.google.sps.servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;


@WebServlet("/submitForm")
public class ContactMeFormSubmissionServlet extends HttpServlet{

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
      String name = Jsoup.clean(request.getParameter("name"), Whitelist.none());
      String email = Jsoup.clean(request.getParameter("email"), Whitelist.none());
      String reason = Jsoup.clean(request.getParameter("reason"), Whitelist.none());

  }
}