//package com.briup.Listener;
//
//import java.util.List;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;
//
//import com.briup.Bean.Category;
//import com.briup.Bean.PriceRank;
//import com.briup.Bean.Product;
//import com.briup.Bean.Publish;
//import com.briup.Dao.GetCategoryDao;
//import com.briup.Dao.PriceRankDao;
//import com.briup.Dao.ProductDao;
///**
// * 
// * @author ���Ͷ�
// *  ������tomcat��������ʱ��Ͱ����е�product�ŵ�application������
// */
//
//@WebListener
//public class ApplicationListener implements ServletContextListener {
//
//  
//    public ApplicationListener() {
//        // TODO Auto-generated constructor stub
//    }
//
//	
//    public void contextInitialized(ServletContextEvent arg0) {
//    	//��ȡ��application����
//    	ServletContext application=arg0.getServletContext();
//    	ProductDao dao=new ProductDao();
//    	List<Product> list=dao.findAllProduct();
//    	application.setAttribute("list", list);
//    	
//    	GetCategoryDao dao1=new GetCategoryDao();
//		List<Category> list1=dao1.selectAllCategory();
//		application.setAttribute("list1", list1);
//		
//		List<Publish> list2=dao.findAllPublish();
//		application.setAttribute("list2", list2);
//		
//		PriceRankDao dao2=new PriceRankDao();
//		List<PriceRank> list3=dao2.findAllPriceRank();
//		application.setAttribute("list3", list3);
//		
//    	System.out.println("������tomcat��������ʱ��Ͱ����е�product��Category�ŵ�application������ ");
//    	
//    }
//
//	
//    public void contextDestroyed(ServletContextEvent arg0) {
//        // TODO Auto-generated method stub
//    }
//	
//}
