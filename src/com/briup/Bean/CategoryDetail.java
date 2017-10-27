package com.briup.Bean;

import java.io.Serializable;
import java.util.Set;

/*
 *�������ϸ��
 */
public class CategoryDetail  implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	//����������
	private Category category;
	//�鼮ϸ��������
	private String name;
	//��Ʒ
	private Set<Product> products;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
