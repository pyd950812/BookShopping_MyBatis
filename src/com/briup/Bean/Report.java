package com.briup.Bean;

import java.util.Set;

/*
 * ���ռ�
 */
public class Report {
	private long id;
	//����
	private String title;
	//���Ƽ��Ĳ�Ʒ
	private Set<Product> products;
	//������ʱ��
	private String start_date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
}
