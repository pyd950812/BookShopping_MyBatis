package com.briup.Bean;
/*
 * ֧����ʽ
 */

import java.io.Serializable;
import java.util.Set;

public class Payway implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	//֧����ʽ������
	private String pay_style;
	//֧����ʽ��ͼƬ
	private String images;
	//����
	private Set<Order> orders;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPay_style() {
		return pay_style;
	}
	public void setPay_style(String pay_style) {
		this.pay_style = pay_style;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	
}
