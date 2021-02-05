package com.store.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.services.ViewProductService;

@RestController
@RequestMapping("/store")
public class ViewProductsController {

	@Autowired
	private ViewProductService service;

	@GetMapping("/products/view")
	public Set<String> getProducts() {
		return this.service.getProducts();
	}

	@GetMapping("/greet")
	public String greet() {
		return "Ho ho";
	}
}
