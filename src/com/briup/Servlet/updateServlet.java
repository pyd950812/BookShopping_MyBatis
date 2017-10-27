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


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���ñ����ʽ����ֹ����
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				
				String name=request.getParameter("username");
				System.out.println("�û�����"+name);
				
				String password=request.getParameter("password");
				System.out.println("���룺"+password);
				
				String zip=request.getParameter("zip");
				System.out.println("zip��"+zip);
				
				String address=request.getParameter("address");
				System.out.println("address��"+address);
				
				String phone=request.getParameter("phone");
				System.out.println("���룺"+phone);
				
				String email=request.getParameter("email");
				System.out.println("email��"+email);
			    
				UserBean user1= (UserBean)request.getSession().getAttribute("user");
				int id=user1.getId();
				System.out.println(id);
				//��ǰ̨����������Ϣ��װ��һ��user
				UserBean user=new UserBean(id,name, password, zip, address, phone, email);
				
				HttpSession session=request.getSession();
				session.removeAttribute("user");
				session.setAttribute("user", user);
				
				UserDao dao=new UserDao();
				
				dao.updateUser(user);
				JOptionPane.showMessageDialog(null, "�޸���Ϣ�ɹ��������µ�¼��","��ʾ",JOptionPane.WARNING_MESSAGE);
				response.sendRedirect("login.html");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
