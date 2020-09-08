package com.eldar.spring.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eldar.spring.core.enitites.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByCity(String city);
}
