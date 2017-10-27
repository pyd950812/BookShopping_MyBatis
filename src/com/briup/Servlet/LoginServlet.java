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
		//���ñ����ʽ����ֹ����
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				//PrintWriter pw=response.getWriter();
				//��ȡrequest���������
				String name=request.getParameter("name");
				//System.out.println(name+" -------");
				String password=request.getParameter("password");
				//System.out.println(password+"--------");
				
				UserDao dao=new UserDao();
				UserBean user=dao.findUserByName(name);
			//	System.out.println(user);
				
				if(user==null){
					System.out.println("�û������ڣ���ȥע��");
					JOptionPane.showMessageDialog(null, "�û������ڣ���ȥע�ᣡ","��ʾ",JOptionPane.WARNING_MESSAGE);
					response.sendRedirect("login.html");
				}else if(password.equals(user.getPassword())){
					//������ɹ����û����浽session��ȥ
					HttpSession session=request.getSession();
					session.setAttribute("user", user);
					
					response.sendRedirect("index.jsp");
					System.out.println("��¼�ɹ�");
				}else {
					JOptionPane.showMessageDialog(null, "�������,�����µ�¼��","��ʾ",JOptionPane.WARNING_MESSAGE);
					response.sendRedirect("login.html");
					//pw.write("�������");
				}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
