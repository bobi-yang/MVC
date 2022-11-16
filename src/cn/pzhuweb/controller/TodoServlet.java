package cn.pzhuweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.pzhuweb.model.UserUtil;
import cn.pzhuweb.proj.Message;
import cn.pzhuweb.proj.userInfo;

/**
 * Servlet implementation class TodoSerlvet
 */
@WebServlet("/TodoServlet")
public class TodoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        //request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String sage = request.getParameter("age");
        String [] hobby = request.getParameterValues("hobby");
        Integer age = 0;
        try {
            age = Integer.parseInt(sage);
        } catch (Exception e) {
            // TODO: handle exception
            request.getSession().setAttribute("age", "年龄没有输入或者不是数字！");
            response.sendRedirect("error.jsp");
            return;
        }
        //将用户登记的信息保存到userinfo中
        userInfo userInfo = new userInfo(username,age,hobby);
        Message message = UserUtil.check(userInfo);
        if(!message.isSuccess()){
            //数据不合法，跳转error页面
            request.getSession().setAttribute("error", message.getmSg());
            response.sendRedirect("error.jsp");
            return;
        }
        //新建一个userinfo的类类型的集合
        ArrayList<userInfo> list = (ArrayList<userInfo>)request.getServletContext().getAttribute("list");
        //判断用户是否被登记
        if (UserUtil.isSave(username,list)) {
            request.getSession().setAttribute("username", "该用户已经被登记了！");
            response.sendRedirect("error.jsp");
            return;
        }
        //将新用户放进集合中
        ArrayList<userInfo> newlist = UserUtil.add(userInfo, list);
        request.getSession().setAttribute("userinfo", userInfo);//显示的时候用
        request.getServletContext().setAttribute("list", newlist);//登记表
        request.getSession().setAttribute("ok", "ok");
        response.sendRedirect("success.jsp");

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
