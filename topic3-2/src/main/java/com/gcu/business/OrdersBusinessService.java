package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface{

	@Override
	public void test() {
		// Simply prints "hello" to the console in order to test the interface's functionality
		System.out.println("Hello");
		
	}

	@Override
	public List<OrderModel> getOrders() {
		
		//Create some Orders
				List<OrderModel> orders = new ArrayList<OrderModel>();
				orders.add(new OrderModel(0L, "00000000001", "Product1", 1.00f, 1));
				orders.add(new OrderModel(1L, "00000000002", "Product2", 2.00f, 2));
				orders.add(new OrderModel(2L, "00000000003", "Product3", 3.00f, 3));
				orders.add(new OrderModel(3L, "00000000004", "Product4", 4.00f, 4));
				orders.add(new OrderModel(4L, "00000000005", "Product5", 5.00f, 5));
				
		//Print orders to the console
				for (OrderModel orderMod : orders) {
					System.out.println(orderMod.toString());
				}
				
		return orders;
		
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Init() test message OrdersBusinessService");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy() test message OrdersBusinessService");
		
	}
	
	
	

}
