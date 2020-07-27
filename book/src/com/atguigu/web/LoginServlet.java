package com.atguigu.web;

/*
public class LoginServlet extends HttpServlet {
    UserService userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User login = userService.login(new User(null, username, password, null));
        if (login==null){
            req.setAttribute("msg","用户名和密码错误");
            req.setAttribute("username",username);
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req,resp);

        }
    }
}
*/
