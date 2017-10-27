package com.briup.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.Bean.Category;
import com.briup.Bean.CategoryDetail;
import com.briup.Mapper.CategoryMapper;
import com.briup.Util.MyBatisSqlSessionFactory;

public class GetCategoryDao {


	//找到所有的Category
	public List<Category> selectAllCategory(){
		List<Category> categorys=null;
		try {
			SqlSession session=MyBatisSqlSessionFactory.openSession();
			CategoryMapper mapper=session.getMapper(CategoryMapper.class);
			categorys=mapper.selectAllCategory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categorys;
	}
	
	public String findCatNameById(int id){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		CategoryMapper mapper=session.getMapper(CategoryMapper.class);
		String name=mapper.findCatNameById(id);
		return name;
	}
}
