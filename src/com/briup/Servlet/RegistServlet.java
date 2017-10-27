package com.briup.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.briup.Bean.UserBean;
import com.briup.Dao.UserDao;



@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//设置编码格式
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		//获取request请求里面的数据
		String name=req.getParameter("name");
		System.out.println("name:"+name);
		
		String password=req.getParameter("password");
		System.out.println("password:"+password);
		
	    String zip=req.getParameter("zip");
	    System.out.println("zip:"+zip);
	    
	    String address=req.getParameter("address");
	    System.out.println("address:"+address);
	    
	    String phone=req.getParameter("telephone");
	    System.out.println("phone:"+phone);
	    
	    String email=req.getParameter("email");
	    System.out.println("email:"+email);
	    
	    
				 
	//将浏览器传进来的数据封装成一个 对象	  
	    UserBean user=new UserBean(name, password, zip, address, phone, email);
	    UserDao dao=new UserDao();
	    
	     
	    if(dao.findUserByName(name)==null){
	    	 dao.addUser(user);
		    System.out.println(user);
	    	System.out.println("注册成功");
	    	resp.sendRedirect("login.html");
	    }else {
	    	JOptionPane.showMessageDialog(null, "用户已存在，请重新注册！","提示",JOptionPane.WARNING_MESSAGE);
	    	resp.sendRedirect("register.html");
		}
	    		
	}
}
