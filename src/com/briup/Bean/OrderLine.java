package com.briup.Bean;

import java.io.Serializable;

//������
public class OrderLine implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	//�����Ʒ������
	private int amount;
	//һ���Ʒ�ĵ���
	private int single_price;
	//��Ʒ��id
	private int product_id;
	//���ڵĶ���
	private Order order;
	//�û���id
	private int user_id;
	//��Ʒ��״̬
	private int status;
	//��Ʒ�İ汾
	private String product_version;
	public long getId() {
		return id;
	}


	public OrderLine() {
		super();
	}


	public OrderLine(int amount, int single_price, int product_id, int user_id) {
		super();
		this.amount = amount;
		this.single_price = single_price;
		this.product_id = product_id;
		this.user_id = user_id;
	}


	public OrderLine(long id, int amount, int single_price, int product_id,
			int user_id) {
		super();
		this.id = id;
		this.amount = amount;
		this.single_price = single_price;
		this.product_id = product_id;
		this.user_id = user_id;
	}


	@Override
	public String toString() {
		return "OrderLine [id=" + id + ", amount=" + amount + ", single_price="
				+ single_price + ", product_id=" + product_id + ", order="
				+ order + ", user_id=" + user_id + ", status=" + status
				+ ", product_version=" + product_version + "]";
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public OrderLine(long id, int amount, int single_price, int product_id,
			Order order, int user_id, int status, String product_version) {
		super();
		this.id = id;
		this.amount = amount;
		this.single_price =  single_price;
		this.product_id = product_id;
		this.order = order;
		this.user_id = user_id;
		this.status = status;
		this.product_version = product_version;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getSingle_price() {
		return single_price;
	}
	public void setSingle_price(int single_price) {
		this.single_price = single_price;
	}
//	public Product getProduct() {
//		return product;
//	}
//	public void setProduct(Product product) {
//		this.product = product;
//	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getProduct_version() {
		return product_version;
	}
	public void setProduct_version(String product_version) {
		this.product_version = product_version;
	}
	
}
