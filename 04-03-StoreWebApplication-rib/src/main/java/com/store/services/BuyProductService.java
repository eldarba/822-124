package com.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BuyProductService extends StoreApiService {

	@Autowired
	private RestTemplate restTemplate;

	public String buyProduct(String productName) {
		String baseUri = getServiceInstanceBaseUriLoadBalanced("buy-products-service");
		String url = baseUri + "/store/products/buy/" + productName;
		System.out.println(url);

		ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
		return result.getBody();
	}
}
