package com.site;

import org.json.JSONObject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vladosby on 23.09.2015.
 */
public class MainPage extends HttpServlet {
    public static String USERNAME = "root";
    public static String PASSWORD = "root";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        if(USERNAME.equals(userName) && PASSWORD.equals(password)){
            JSONObject json = new JSONObject();
            json.put("username", "Mashita");
            json.put("textMsg", "You're the best:)");
            resp.setContentType("application/json");
            resp.getWriter().write(json.toString());
        } else {
            JSONObject json = new JSONObject();
            json.put("errorMsg", "I don't know you, enter correct login and password!");
            resp.setContentType("application/json");
            resp.getWriter().write(json.toString());
        }


    }
}
