package com.eldar.spring.core.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eldar.spring.core.enitites.Customer;
import com.eldar.spring.core.enitites.Order;
import com.eldar.spring.core.repositories.CustomerRepository;
import com.eldar.spring.core.repositories.OrderRepository;

@Service
public class Shop {

	@Autowired
	private CustomerRepository custRepo;
	@Autowired
	private OrderRepository orderRepo;

	public void addCustomer(Customer customer) {
		custRepo.save(customer);
	}

	public void deleteCustomer(int customerId) {
		custRepo.deleteById(customerId);
	}

	public Customer getCustomer(int id) {
		Optional<Customer> opt = custRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}

	public List<Customer> getAllCustomers() {
		return custRepo.findAll();
	}

	public List<Customer> getAllCustomersByCity(String city) {
		return custRepo.findByCity(city);
	}

	public List<Order> getAllOrders() {
		return orderRepo.findAll();
	}

	public List<Order> getExpiredOrders() {
		return orderRepo.findBySupplyDateBefore(LocalDate.now());
	}

	public List<Order> getOrdersDueIn(int days) {
		return orderRepo.findBySupplyDateBefore(LocalDate.now().plusDays(days));
	}

}
