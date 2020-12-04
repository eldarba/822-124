package com.eldar.productswebservice.controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
@CrossOrigin
public class ProductsController {

	private Map<Integer, Product> map = new HashMap<Integer, Product>();

	@PostMapping("add")
	public void addProduct(@RequestBody Product product) {
		System.out.println("add");
		map.put(product.getId(), product);
		System.out.println(map);
	}

	@GetMapping("get/{id}")
	public Product getProduct(@PathVariable int id) {
		System.out.println("get");
		return map.get(id);
	}

	@GetMapping("get-all")
	public Collection<Product> readAll() {
		System.out.println("get all");
		return map.values();
	}

}
