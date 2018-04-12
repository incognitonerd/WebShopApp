package com.webshopapp.service;
import java.util.Map;
import com.webshopapp.model.InventoryResponse;
import com.webshopapp.model.Order;

public interface OrderService {
	public void sendOrder(Order order);
	
	public void updateOrder(InventoryResponse response);
	
	public Map<String, Order> getAllOrders();
}