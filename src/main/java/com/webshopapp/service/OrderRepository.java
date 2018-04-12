package com.webshopapp.service;
import java.util.Map;
import com.webshopapp.model.Order;

public interface OrderRepository {
	public void putOrder(Order order);
	
	public Order getOrder(String orderId);
	
	public Map<String, Order> getAllOrders();
}