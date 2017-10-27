package com.briup.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.Bean.OrderLine;
import com.briup.Mapper.OrderLineMapper;
import com.briup.Util.MyBatisSqlSessionFactory;

public class OrderLineDao {
	
	//根据用户的id找该用户所有的orderline
	public List<OrderLine> findAllOrderLineByUserId(int user_id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		OrderLineMapper mapper=session.getMapper(OrderLineMapper.class);
		List<OrderLine> list=mapper.findAllOrderLineByUserId(user_id);
		session.commit();
		return list;
		
	}
	//将要购买的s书加入到orderline表中
	public void addProductToOrderLine(OrderLine orderline){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		OrderLineMapper mapper=session.getMapper(OrderLineMapper.class);
		mapper.addProductToOrderLine(orderline);
		session.commit();
	}
	
	//根据list下标删除所选的orderline
	
	public void deleteProductByNum(int order_id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		OrderLineMapper mapper=session.getMapper(OrderLineMapper.class);
		mapper.deleteProductByNum(order_id);
		session.commit();
	}
	
	//根据user_id把该用户所有的orderline清空
	public void deleteAllProductById(int user_id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		OrderLineMapper mapper=session.getMapper(OrderLineMapper.class);
		mapper.deleteAllProductById(user_id);
		session.commit();
	}
}
