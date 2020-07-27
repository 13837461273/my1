package com.atguigu.ajax;

import com.atguigu.pojo.Person;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxServlet extends BaseServlet {

    protected void ajaxRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ajax来了");
        Person person = new Person(22, "老虎");
        Gson gson = new Gson();
        String s = gson.toJson(person);
        resp.getWriter().write(s);
    }
    protected void jQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryAjax方法调用了");
        Person person = new Person(22, "老虎");
        Gson gson = new Gson();
        String s = gson.toJson(person);
        resp.getWriter().write(s);
    }
}
