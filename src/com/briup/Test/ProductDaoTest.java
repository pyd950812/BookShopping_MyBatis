package com.briup.Test;

import java.util.List;

import com.briup.Bean.Product;
import com.briup.Dao.ProductDao;

public class ProductDaoTest {
	public static void main(String[] args) {
		ProductDao dao=new ProductDao();
//		int id=dao.findCateDeIdByName("java");
//		List<Product> list=dao.findProductByCateId(id);
//		for(Product p:list){
//			System.out.println(p.getName());
//		}
		int id=dao.findCatIdByPId(1);
		String name=dao.findCatDeNameById(id);
		System.out.println(name);
		
	}
}	
