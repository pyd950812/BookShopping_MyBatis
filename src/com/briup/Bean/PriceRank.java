package com.briup.Bean;
/*
 * ������ʱ��۸�ķ�Χ
 */
public class PriceRank {
	private long id;
	//��С��Ǯ
	private long min_price;
	//��߼�Ǯ
	private long max_price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getMin_price() {
		return min_price;
	}
	public void setMin_price(long min_price) {
		this.min_price = min_price;
	}
	public long getMax_price() {
		return max_price;
	}
	public void setMax_price(long max_price) {
		this.max_price = max_price;
	}
}