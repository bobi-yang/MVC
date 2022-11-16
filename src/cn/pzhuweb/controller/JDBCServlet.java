package cn.pzhuweb.controller;

import cn.pzhuweb.proj.User;
import com.mysql.jdbc.Driver;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class JDBCServlet
 */
@WebServlet("/jdbc")
public class JDBCServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        try{
            //1注册成功
            Class.forName("com.mysql.jdbc.Driver");
            //2，获得链接
            String url = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8";
            String user="root";
            String password="123456";
            //test 测试是否链接成功
            Connection connection = DriverManager.getConnection(url,user,password);
              response.getWriter().print(connection);
            //4，创建命令对象
            String sql="select * form user where name=?";
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //5,执行命令
            ResultSet resultSet = statement.executeQuery(sql);
            //6.处理结果
            ArrayList<User> list =new ArrayList<>();

            while (resultSet.next()==true){
            String name = resultSet.getString(1);
            String pwd = resultSet.getString("password");
            User temp = new User(name, pwd);
            list.add(temp);
            //释放资源
            resultSet.close();
            statement.close();
            connection.close();
            request.getSession().setAttribute("list",list);
            response.sendRedirect("show1.jsp");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

    }

}
