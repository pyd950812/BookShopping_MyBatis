package com.briup.Dao;

import org.apache.ibatis.session.SqlSession;

import com.briup.Mapper.OrderMapper;
import com.briup.Util.MyBatisSqlSessionFactory;

public class OrderDao {
	
	public void addOrder(){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		OrderMapper mapper=session.getMapper(OrderMapper.class);
		mapper.addOrder();
		session.commit();
	}
}
