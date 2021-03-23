package com.google.sps.servlets;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.KeyFactory;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;


@WebServlet("/submitForm")
public class ContactMeFormSubmissionServlet extends HttpServlet{

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

      // get form information
      String name = Jsoup.clean(request.getParameter("name"), Whitelist.none());
      String email = Jsoup.clean(request.getParameter("email"), Whitelist.none());
      String reason = Jsoup.clean(request.getParameter("reason"), Whitelist.none());

      // create new datastore and keyfactory 
      Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
      KeyFactory keyFactory = datastore.newKeyFactory();

      // add kind submissions to keyfactory
      keyFactory.setKind("submissions");
     
      //take the submission elements and create a new entity object for it 
      FullEntity submissionEntity =
        Entity.newBuilder(keyFactory.newKey())
            .set("e-name", name)
            .set("e-email", email)
            .set("e-reason", reason)
            .build();
      datastore.put(submissionEntity);

      response.getWriter().println("Sent");
  }
}