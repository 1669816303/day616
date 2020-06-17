package com.cuixun.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/index.jsp")
public class TakeCookiesServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookie = req.getCookies();
        if (cookie==null){
            resp.sendRedirect("/login.jsp");
            return;
        }
        for (Cookie c : cookie) {
            if (Constans.NAME.equals(c.getName()) && "mayun".equals(c.getValue())) {
                for (Cookie c2 : cookie) {
                    if (Constans.PWD.equals(c2.getName()) && "123".equals(c2.getValue())) {
                        resp.sendRedirect("success.jsp");
                        return;
                    }
                }
            }
        }
        resp.sendRedirect("/login.jsp");
    }
}
