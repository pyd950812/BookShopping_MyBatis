package com.briup.Bean;

import java.io.Serializable;
import java.util.Set;

/*
 * �ռ���
 */
public class Receiver implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	//�ռ�������
	private String name;
	//�ռ��˵�ַ
	private String address;
	//�ռ��˵绰����
	private String phone;
	//����
	private Set<Order> orders;
	//�û�
	private UserBean user;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	
}
