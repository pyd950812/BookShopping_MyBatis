package com.briup.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.Bean.UserBean;
import com.briup.Dao.UserDao;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String username=request.getParameter("username");
		UserDao dao=new UserDao();
		UserBean user=dao.findUserByName(username);
		PrintWriter writer=response.getWriter();
			if(user!=null){
				response.setContentType("text/html;charset=utf-8");
				writer.write("defeat");
			}else {
				response.setContentType("text/html;charset=utf-8");
				writer.write("success");
		}
		writer.flush();
		writer.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
