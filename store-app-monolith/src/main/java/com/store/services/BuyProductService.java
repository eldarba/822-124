package com.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.repositories.StoreRepository;

@Service
public class BuyProductService {

	@Autowired
	private StoreRepository storeRepository;

	public String buyProduct(String productName) {
		if (this.storeRepository.isExist(productName)) {
			return "success buy: " + productName;
		} else {
			return "success failed: " + productName + " not found";
		}
	}
}
