package com.example.NodarTopuria;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Register", value = "/")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String petName=req.getParameter("petName");
        String petsJishi=req.getParameter("petsJishi");
        String petGender=req.getParameter("petGender");
        String petAge=req.getParameter("petAge");
        System.out.println("სახელი არის: "+petName);
        System.out.println("ჯიში არის: "+petsJishi);
        System.out.println("სქესი არის: "+petGender);
        System.out.println("ასაკი არის: "+petAge);
    }
}