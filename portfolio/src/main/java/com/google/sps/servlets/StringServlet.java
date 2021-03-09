package com.google.sps.servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;
import com.google.gson.Gson;



@WebServlet("/strservlet")
public class StringServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/String;");
        Gson gson = new Gson();
        
        //create a new array list and input quoataions.
        ArrayList<String> quotations = new ArrayList<String>();

        quotations.add("The past is not dead. In fact, it's not even past.  -William Faulkner");
        quotations.add("Education is the passport to the future, for tomorrow belongs to those who prepare for it today. -Malcolm X");
        quotations.add("Don't count the days, make the days count. -Muhammad Ali");

        /*
        //print quotations 
        for(String quote : quotations){
            response.getWriter().println(quote);
        }
        */

        //return the arraylist as json
        String qJSON = gson.toJson(quotations);
        
        response.getWriter().println(qJSON);
    }
}