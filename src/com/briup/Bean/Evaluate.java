package com.briup.Bean;

import java.io.Serializable;

/*
 * ��Ʒ������
 */
public class Evaluate  implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	//���۸�����ͼƬ 
	private String images;
	//���۵�ʱ��
	private String eva_date;
	//���۵��û�
	private UserBean user;
	//���۵Ĳ�Ʒ
	private Product product;
	//��Ʒ���Ǽ�����
	private int state;
	//����
	private String content;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getEva_date() {
		return eva_date;
	}
	public void setEva_date(String eva_date) {
		this.eva_date = eva_date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	
}
