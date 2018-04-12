package com.activemqdemo.service;
import java.util.Map;
import com.activemqdemo.model.Order;

public interface OrderRepository {
	public void putOrder(com.activemqdemo.model.Order order);
	
	public Order getOrder(String orderId);
	
	public Map<String, Order> getAllOrders();
}