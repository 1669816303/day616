package com.cuixun.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

@WebServlet("/getCookies")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");
        Cookie[] cookie=req.getCookies();
        PrintWriter out=resp.getWriter();

        if (cookie!=null){
            for (Cookie c:cookie){
                out.write("name:"+ c.getName()+" value:"+URLDecoder.decode(c.getValue(),"utf-8"));
                out.write("<br>");
            }
        }else {
            out.write("没有cookies");
        }
    }
}
