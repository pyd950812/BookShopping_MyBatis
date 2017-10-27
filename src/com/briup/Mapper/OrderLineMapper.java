package com.briup.Mapper;

import java.util.List;

import com.briup.Bean.OrderLine;

public interface OrderLineMapper {
	public List<OrderLine> findAllOrderLineByUserId(int user_id);
	public void addProductToOrderLine(OrderLine orderline);
	public void deleteProductByNum(int order_id);
	public void deleteAllProductById(int user_id);
}
