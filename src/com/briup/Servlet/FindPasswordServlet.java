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


@WebServlet("/FindPasswordServlet")
public class FindPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String newpassword=request.getParameter("txtUser");
		
		String newpassword1=request.getParameter("txtUser1");
		if(newpassword.equals(newpassword1)){
			
			HttpSession session=request.getSession();
			UserBean user=(UserBean) session.getAttribute("user");
			String name=user.getUsername();
			
			UserDao dao=new UserDao();
			dao.changePasswd(name, newpassword);
		    response.sendRedirect("forgetPassword3.html");
		}else {
			JOptionPane.showMessageDialog(null, "两次输入的密码不一致，请重新输入！","提示",JOptionPane.WARNING_MESSAGE);
			request.getRequestDispatcher("forgetPassword2.html").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
