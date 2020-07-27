package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet {
    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Cookie cookie = new Cookie("path1","path1");
            cookie.setPath(req.getContextPath()+"/abc");
            resp.addCookie(cookie);

    }
        protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key3","value5");
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
    }

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key3","value5");
        cookie.setMaxAge(0);
        resp.addCookie(cookie);
    }
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key2","value3");
        resp.addCookie(cookie);
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie1:cookies) {
            cookie1.setValue("value4");
            resp.addCookie(cookie1);
        }

    }

        protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key2","value2");
            resp.addCookie(cookie);
            resp.getWriter().write(cookie.getName()+"="+cookie.getValue());
    }

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key1","value1");
        resp.addCookie(cookie);
        resp.getWriter().write("cookie成功了");

    }
}
