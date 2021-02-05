package com.store.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("buy-products-service")
public interface BuyProductService {

	@GetMapping("/store/products/buy/{productName}")
	String buyProduct(@PathVariable String productName);
}
