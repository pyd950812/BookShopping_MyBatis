package com.briup.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.Bean.UserBean;

import com.briup.Dao.OrderLineDao;


@WebServlet("/overTheOrderServlet")
public class overTheOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean user=(UserBean) request.getSession().getAttribute("user");
		OrderLineDao dao=new OrderLineDao();
		dao.deleteAllProductById(user.getId());
		response.sendRedirect("emptyCar.jsp");//地址栏中会显示新的地址
		//request.getRequestDispatcher("emptyCar.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
