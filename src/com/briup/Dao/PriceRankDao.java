package com.briup.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.Bean.PriceRank;
import com.briup.Mapper.PriceRankMapper;
import com.briup.Util.MyBatisSqlSessionFactory;

public class PriceRankDao {
	
	public List<PriceRank> findAllPriceRank(){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		PriceRankMapper mapper=session.getMapper(PriceRankMapper.class);
		List<PriceRank> list=mapper.findAllPriceRank();
		session.commit();
		return list;
	}
}
