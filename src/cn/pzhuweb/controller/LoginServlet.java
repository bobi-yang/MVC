package cn.pzhuweb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.pzhuweb.proj.Message;
import cn.pzhuweb.proj.User;
import cn.pzhuweb.service.UserService;
import cn.pzhuweb.service.imp.UserServiceImp;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String  name = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(name, password);
        UserService us = new UserServiceImp();
        Message message = us.login(user);
        if (message.isSuccess()) {
            request.getSession().setAttribute("ok", "yes");//为了让过滤器放行
            request.getSession().setAttribute("user", user);//为了判断是否登录，显示功能菜单
            response.getWriter().print("<script>alert('"+message.getmSg()+"');window.location.href='success1.jsp';</script>");
        }else{
            response.getWriter().print("<script>alert('"+message.getmSg()+"');window.location.href='login.jsp';</script>");
        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
