package com.briup.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.Bean.OrderLine;
import com.briup.Bean.UserBean;
import com.briup.Dao.OrderLineDao;


@WebServlet("/deleteOrderServlet")
public class deleteOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String index=request.getParameter("order_id");
		int order_id=Integer.parseInt(index);
		System.out.println(order_id+"%%%%%%%%%%%%");
	    OrderLineDao dao=new OrderLineDao();
	    dao.deleteProductByNum(order_id);
	    PrintWriter pw=response.getWriter();
	    pw.write("success");
	    
	    
	  //  response.sendRedirect("shopCart.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
