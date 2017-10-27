package com.briup.Mapper;

import java.util.List;

import com.briup.Bean.Product;
import com.briup.Bean.Publish;

public interface ProductMapper {
	public List<Product> findAllProduct();
	public List<Publish> findAllPublish();
	public int  findCateDeIdByName(String name);
	public List<Product> findProductByCateId(int category_id);
	public Product findProductById(int id);
	public int findCatIdByPId(int id);
	public String findCatDeNameById(int id);
	public int findCategory_detail_IdById(int product_id);
	public List<Product> findProductByPriceRankId(long PriceRank_id);
	
}
