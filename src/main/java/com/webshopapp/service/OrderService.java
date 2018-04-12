package com.activemqdemo.service;
import java.util.Map;
import com.activemqdemo.model.InventoryResponse;
import com.activemqdemo.model.Order;

public interface OrderService {
	public void sendOrder(com.activemqdemo.model.Order order);
	
	public void updateOrder(InventoryResponse response);
	
	public Map<String, Order> getAllOrders();
}