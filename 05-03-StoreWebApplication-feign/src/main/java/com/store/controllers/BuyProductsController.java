package com.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.services.BuyProductService;

@RestController
@RequestMapping("/store")
public class BuyProductsController {

	@Autowired
	private BuyProductService service;

	@GetMapping("/products/buy/{productName}")
	public String buyProduct(@PathVariable String productName) {
		return this.service.buyProduct(productName);
	}
}
