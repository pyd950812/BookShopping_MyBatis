package com.briup.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.Bean.Product;
import com.briup.Dao.ProductDao;
import com.briup.Mapper.ProductMapper;


@WebServlet("/AjaxProductServlet")
public class AjaxProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	
		String id=request.getParameter("price_id");
		int price_id=Integer.parseInt(id);
		ProductDao dao=new ProductDao();
		List<Product> list=dao.findProductByPriceRankId(price_id);
		request.setAttribute("list6", list);
	//	request.getSession().setAttribute("list6", list);
	
		
		request.getRequestDispatcher("product.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
