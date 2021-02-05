package com.store.services;

import java.util.Set;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("view-products-service")
public interface ViewProductService {

	@GetMapping("/store/products/view")
	Set<String> getProducts();

}
