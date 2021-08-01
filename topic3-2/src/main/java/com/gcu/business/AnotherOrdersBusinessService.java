package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessInterface {

	@Override
	public void test() {
		// Simply prints "Sup, from the ABS bean" to the console in order to test the interface's functionality
		System.out.println("Sup, from the ABS bean");
		
	}

	@Override
	public List<OrderModel> getOrders() {
		
		//Create some Orders
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "00000000001", "Thing1", 6.00f, 6));
		orders.add(new OrderModel(1L, "00000000002", "Thing2", 7.00f, 7));
		orders.add(new OrderModel(2L, "00000000003", "Thing3", 8.00f, 8));
		orders.add(new OrderModel(3L, "00000000004", "Thing4", 9.00f, 9));
		orders.add(new OrderModel(4L, "00000000005", "Thing5", 10.00f, 10));
		
//Print orders to the console
		for (OrderModel orderMod : orders) {
			System.out.println(orderMod.toString());
		}
		
return orders;
		
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Init() test message AnotherOrdersBusinessService");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy() test message AnotherOrdersBusinessService");
	}

}
