package com.cuixun.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account=req.getParameter(Constans.NAME);
        String pwd=req.getParameter(Constans.PWD);
        String day=req.getParameter("selectDay");
        int maxAge=0;
        if ("1".equals(day)){
            maxAge=7*24*60*60;
        }else if ("2".equals(day)){
            maxAge=30*24*60*60;
        }
        Cookie name=new Cookie(Constans.NAME,account);
        Cookie mima=new Cookie(Constans.PWD,pwd);
        name.setMaxAge(maxAge);
        mima.setMaxAge(maxAge);
        resp.addCookie(name);
        resp.addCookie(mima);
        resp.sendRedirect("success.jsp");
    }
}
