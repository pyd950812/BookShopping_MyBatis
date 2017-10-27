package com.briup.Test;

import java.util.List;

import com.briup.Bean.Category;
import com.briup.Bean.CategoryDetail;
import com.briup.Dao.GetCategoryDao;

public class CategoryDaoTest {
	public static void main(String[] args) {
		GetCategoryDao dao=new GetCategoryDao();

		List<Category> categories=dao.selectAllCategory();
		for(int i=0;i<categories.size();i++){
			Category category=categories.get(i);
			System.out.println(category);
		}
	}
}
