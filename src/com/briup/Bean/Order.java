package com.briup.Bean;

import java.io.Serializable;
import java.util.List;


/*
 * ����
 */
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	//���ɵĶ������
	private String num;
	//�������ɵ�ʱ��
	private String start_date;
	//���в�Ʒ���ܼ�
	private double sum_price;
	//֧����ʽ
	private Payway payway;
	//������״̬:1�������2��ɣ�3����
	private String status;
	//�����������û�
	private int user_id;
	
	private int product_id;
	
	public Order(long id, int user_id, int product_id
			) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.product_id = product_id;

	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	//��������ϸ��Ϣ
	private Receiver receiver;
	private List<OrderLine> orderlines;
	
	public Order(long id, String num, String start_date, double sum_price,
			int user_id) {
		super();
		this.id = id;
		this.num = num;
		this.start_date = start_date;
		this.sum_price = sum_price;
		this.user_id = user_id;
	}
	public Order(long id, String num, String start_date, double sum_price,
			int user_id, List<OrderLine> orderlines) {
		super();
		this.id = id;
		this.num = num;
		this.start_date = start_date;
		this.sum_price = sum_price;
		this.user_id = user_id;
		this.orderlines = orderlines;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public double getSum_price() {
		return sum_price;
	}
	public void setSum_price(double sum_price) {
		this.sum_price = sum_price;
	}
	public Payway getPayway() {
		return payway;
	}
	public void setPayway(Payway payway) {
		this.payway = payway;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Receiver getReceiver() {
		return receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	public List<OrderLine> getOrderlines() {
		return orderlines;
	}
	public void setOrderlines(List<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	
}
