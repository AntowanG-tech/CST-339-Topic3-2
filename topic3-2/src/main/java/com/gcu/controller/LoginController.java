package com.gcu.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private OrdersBusinessInterface service;
	
	@Autowired
	private SecurityBusinessService security;

	@GetMapping("/")
	public String display(Model model) {
		
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		model.addAttribute("test", "Learning form validtion with Spring Boot is fun.");
		
		return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		//Check for validation errors
		if (bindingResult.hasErrors())
		{
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		//Print the from values out
		System.out.println(String.format("Form with Username of %s and Password of %s", loginModel.getUsername(), loginModel.getPassword()));
		
		
		
		//display the Orders View
		model.addAttribute("test", "This is your Orders Page");
		model.addAttribute("title", "Viewing Your Orders");
		model.addAttribute("orders", service.getOrders());
		
		//calling the test method in the OrdersBusinessInterface
		service.test();
		security.authenticate(null, null);
		
		
		//navigate back to the login page
		return "orders";
		
	}
	
}
