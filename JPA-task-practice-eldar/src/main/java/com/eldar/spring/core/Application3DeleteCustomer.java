package com.eldar.spring.core;

import java.util.Collection;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.eldar.spring.core.enitites.Customer;
import com.eldar.spring.core.services.Shop;

@SpringBootApplication
public class Application3DeleteCustomer implements ApplicationContextAware {

	private static ApplicationContext ctx;

	public static void main(String[] args) {

		SpringApplication.run(Application3DeleteCustomer.class, args);

		// create a shop service
		Shop shop = ctx.getBean(Shop.class);

		// get customer and orders
		int customerId = 2;
		System.out.println("\n========= get CUSTOMER by id");
		Customer customer = shop.getCustomer(customerId);
		System.out.println(customer);
		if (customer != null) {
			System.out.println("\n========= get CUSTOMER ORDERS");
			printCollection(customer.getOrders());

			System.out.println("\n========= DELETE the CUSTOMER");

			shop.deleteCustomer(customerId);
			System.out.println("deleted: " + customer);
		} else {
			System.out.println("customer " + customerId + " not deleted - not found");
		}

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}

	private static void printCollection(Collection<?> col) {
		for (Object object : col) {
			System.out.println(object);
		}
	}

}
