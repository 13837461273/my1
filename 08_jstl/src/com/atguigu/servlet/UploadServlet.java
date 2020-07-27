package com.atguigu.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("文件");
       if (ServletFileUpload.isMultipartContent(req)){
           ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
           try {
               List<FileItem> list = servletFileUpload.parseRequest(req);
               for (FileItem fileItem:list
                    ) {if (fileItem.isFormField()){
                        System.out.println("表单项的name属性值"+fileItem.getFieldName());
                        System.out.println("表单项的value属性值:"+fileItem.getString("UTF-8"));
                      }else { System.out.println("表单项的name属性值"+fileItem.getFieldName());
                   System.out.println("上传的文件名"+fileItem.getName());
                   fileItem.write(new File("f:\\"+fileItem.getName()));

               }
                   
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
       }

    }
}
