package com.briup.Bean;

import java.io.Serializable;
import java.util.Set;

/*
 * ������
 */
public class Publish  implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	//�����������
	private String name;
	private Set<Product> products;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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