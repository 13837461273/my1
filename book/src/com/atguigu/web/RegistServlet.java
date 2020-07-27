package com.atguigu.web;

/*

public class RegistServlet extends HttpServlet {
    private UserService userService=new UserServiceImpl();



        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
        if ("abcd".equals(code)){
            if (userService.existsUsername(username)) {
                req.setAttribute("msg","用户名已存在");
                req.setAttribute("username",username);
                req.setAttribute("email",email);
                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req,resp);
                System.out.println("用户名不可用");
            }else{userService.registUser(new User(null,username,password,email));
                req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req,resp);

            }

        }else {req.setAttribute("msg","验证码不正确");
                req.setAttribute("username",username);
                req.setAttribute("email",email);
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req,resp);

        }
    }
}
*/
