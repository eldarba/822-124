package com.store.repositories;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

@Repository
public class StoreRepository {

	private Set<String> products = new HashSet<>();
	{
		this.products.add("milk");
		this.products.add("eggs");
		this.products.add("bread");
		this.products.add("potatos");
	}

	public Set<String> getProducts() {
		return products;
	}

	public boolean isExist(String productName) {
		return products.contains(productName);
	}

}
