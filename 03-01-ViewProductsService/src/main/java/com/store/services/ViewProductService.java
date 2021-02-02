package com.store.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.repositories.StoreRepository;

@Service
public class ViewProductService {

	@Autowired
	private StoreRepository storeRepository;

	public Set<String> getProducts() {
		return this.storeRepository.getProducts();
	}
}
