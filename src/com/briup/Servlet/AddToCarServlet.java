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

import com.briup.Bean.OrderLine;
import com.briup.Bean.Product;
import com.briup.Bean.UserBean;

import com.briup.Dao.OrderLineDao;
import com.briup.Dao.ProductDao;


@WebServlet("/AddToCarServlet")
public class AddToCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id=request.getParameter("product_id");
	    int product_id=Integer.parseInt(id);
		
		 String number=request.getParameter("num");
         int num=Integer.parseInt(number);
		 
		 HttpSession session=request.getSession();
		 UserBean user=(UserBean) session.getAttribute("user");
		 int user_id=user.getId();
		 
		 OrderLineDao dao=new OrderLineDao();
		 int index=1;
		 List<OrderLine> list=dao.findAllOrderLineByUserId(user_id);
		 for(OrderLine o:list){
			 if(o.getProduct_id()==product_id){
				index=2;
				break;
			 }
		 }
		if(index==2){ 
			JOptionPane.showMessageDialog(null, "该书已经在购物车中！","提示",JOptionPane.WARNING_MESSAGE);
			response.sendRedirect("viewBook.jsp?Product_id="+product_id);
	    }else {
	    	ProductDao dao1=new ProductDao();
		 Product p =dao1.findProductById(product_id);
		 int price=(int) p.getPrice();
		 OrderLine order=new OrderLine(num, price, product_id, user_id);
		 dao.addProductToOrderLine(order);
		 JOptionPane.showMessageDialog(null, "添加到购物车成功！","提示",JOptionPane.WARNING_MESSAGE);
		 response.sendRedirect("viewBook.jsp?Product_id="+product_id);
	  }
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
