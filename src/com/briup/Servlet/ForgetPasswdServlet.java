package com.briup.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.briup.Bean.UserBean;
import com.briup.Dao.UserDao;


@WebServlet("/ForgetPasswdServlet")
public class ForgetPasswdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("txtUser");
		UserDao dao=new UserDao();
		UserBean user=dao.findUserByName(name);
		
		
		
		if(user==null){
			JOptionPane.showMessageDialog(null, "用户名不存在，请重新输入！","提示",JOptionPane.WARNING_MESSAGE);
			response.sendRedirect("forgetPassword.html");
		}else {
			
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			
			request.getRequestDispatcher("forgetPassword1.html").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
