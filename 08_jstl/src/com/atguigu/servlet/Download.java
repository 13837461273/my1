package com.atguigu.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String downloadFileName = "a.jpg";
        ServletContext servletContext = getServletContext();
        String mimeType = servletContext.getMimeType("/file/" + downloadFileName);
        resp.setContentType(mimeType);
        resp.setHeader("Content-Disposition","attachment;filename="+downloadFileName);


        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFileName);


      OutputStream outputStream = resp.getOutputStream();
        IOUtils.copy(resourceAsStream,outputStream);


    }
}
