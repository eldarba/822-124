package com.store.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViewProductService extends StoreApiService {

	@Autowired
	private RestTemplate restTemplate;

	public Set<String> getProducts() {
		String baseUri = getServiceInstanceBaseUriLoadBalanced("view-products-service");
		String url = baseUri + "/store/products/view";
		System.out.println(url);

		ParameterizedTypeReference<Set<String>> type = new ParameterizedTypeReference<Set<String>>() {
		};
		ResponseEntity<Set<String>> result = restTemplate.exchange(url, HttpMethod.GET, null, type);
		return result.getBody();
	}
}
