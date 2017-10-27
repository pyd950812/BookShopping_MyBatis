package com.briup.Dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;

import com.briup.Bean.Product;
import com.briup.Bean.Publish;
import com.briup.Mapper.ProductMapper;
import com.briup.Util.MyBatisSqlSessionFactory;

public class ProductDao {
	//找到所有的product，存放在一个list集合中
	public List<Product> findAllProduct(){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		List<Product> list=mapper.findAllProduct();
		return list;
	}
	
	public List<Publish> findAllPublish(){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		List<Publish> list=mapper.findAllPublish();
		return list;
	}
	
	public int  findCateDeIdByName(String name){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		int category_id=mapper.findCateDeIdByName(name);
		return category_id;
	}
	
	public List<Product> findProductByCateId(int category_id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		List<Product> list=mapper.findProductByCateId(category_id);
		return list;
	}
	
	public Product findProductById(int id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		Product product=mapper.findProductById(id);
		return product;
		
	}
	
	public int findCatIdByPId(int id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		int id1=mapper.findCatIdByPId(id);
		return id1;
		
	}
	
	public String findCatDeNameById(int id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		String name=mapper.findCatDeNameById(id);
		return name;
	}
	//根据product的id找到Category_detail_Id
	public int findCategory_detail_IdById(int product_id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		int Category_detail_Id=mapper.findCategory_detail_IdById(product_id);
		return Category_detail_Id;
		
	}
	public List<Product> findProductByPriceRankId(int PriceRank_id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		ProductMapper mapper=session.getMapper(ProductMapper.class);
		List<Product> list=mapper.findProductByPriceRankId(PriceRank_id);
		session.commit();
		return list;
			
	}
}
