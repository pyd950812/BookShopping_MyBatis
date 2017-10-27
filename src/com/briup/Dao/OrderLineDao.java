package com.briup.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.Bean.OrderLine;
import com.briup.Mapper.OrderLineMapper;
import com.briup.Util.MyBatisSqlSessionFactory;

public class OrderLineDao {
	
	//�����û���id�Ҹ��û����е�orderline
	public List<OrderLine> findAllOrderLineByUserId(int user_id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		OrderLineMapper mapper=session.getMapper(OrderLineMapper.class);
		List<OrderLine> list=mapper.findAllOrderLineByUserId(user_id);
		session.commit();
		return list;
		
	}
	//��Ҫ�����s����뵽orderline����
	public void addProductToOrderLine(OrderLine orderline){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		OrderLineMapper mapper=session.getMapper(OrderLineMapper.class);
		mapper.addProductToOrderLine(orderline);
		session.commit();
	}
	
	//����list�±�ɾ����ѡ��orderline
	
	public void deleteProductByNum(int order_id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		OrderLineMapper mapper=session.getMapper(OrderLineMapper.class);
		mapper.deleteProductByNum(order_id);
		session.commit();
	}
	
	//����user_id�Ѹ��û����е�orderline���
	public void deleteAllProductById(int user_id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		OrderLineMapper mapper=session.getMapper(OrderLineMapper.class);
		mapper.deleteAllProductById(user_id);
		session.commit();
	}
}
