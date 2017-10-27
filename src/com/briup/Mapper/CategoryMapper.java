package com.briup.Mapper;

import java.util.List;

import com.briup.Bean.Category;
import com.briup.Bean.CategoryDetail;

public interface CategoryMapper {

	List<Category> selectAllCategory();
	public String findCatNameById(int id);
}
