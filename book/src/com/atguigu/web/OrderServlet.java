package com.atguigu.web;

import com.atguigu.pojo.Cart;
import com.atguigu.pojo.User;
import com.atguigu.service.OrderService;
import com.atguigu.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OrderServlet extends BaseServlet {
    private OrderService orderService=new OrderServiceImpl();

    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart cart =(Cart) req.getSession().getAttribute("cart");

        User user = (User) req.getSession().getAttribute("user");
       if (user==null){
           req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
           return;
       }
        Integer userId = user.getId();
        String orderId = orderService.createOrder(cart, userId);

        //  req.setAttribute("orderId",orderId);
        req.getSession().setAttribute("orderId",orderId);
       // req.getRequestDispatcher("/pages/cart/checkout.jsp").forward(req,resp);
        resp.sendRedirect(req.getContextPath()+"/pages/cart/checkout.jsp");

    }
}
