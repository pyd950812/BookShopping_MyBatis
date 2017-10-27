package com.briup.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.briup.Bean.Category;
import com.briup.Bean.UserBean;
import com.briup.Dao.GetCategoryDao;
import com.briup.Dao.UserDao;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码格式，防止乱码
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				//PrintWriter pw=response.getWriter();
				//获取request里面的数据
				String name=request.getParameter("name");
				//System.out.println(name+" -------");
				String password=request.getParameter("password");
				//System.out.println(password+"--------");
				
				UserDao dao=new UserDao();
				UserBean user=dao.findUserByName(name);
			//	System.out.println(user);
				
				if(user==null){
					System.out.println("用户不存在，请去注册");
					JOptionPane.showMessageDialog(null, "用户不存在，请去注册！","提示",JOptionPane.WARNING_MESSAGE);
					response.sendRedirect("login.html");
				}else if(password.equals(user.getPassword())){
					//将登入成功的用户保存到session中去
					HttpSession session=request.getSession();
					session.setAttribute("user", user);
					
					response.sendRedirect("index.jsp");
					System.out.println("登录成功");
				}else {
					JOptionPane.showMessageDialog(null, "密码错误,请重新登录！","提示",JOptionPane.WARNING_MESSAGE);
					response.sendRedirect("login.html");
					//pw.write("密码错误");
				}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
