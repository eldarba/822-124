package com.eldar.spring.core;

import java.util.Collection;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.eldar.spring.core.services.Shop;

@SpringBootApplication
public class Application2ReadingInfo implements ApplicationContextAware {

	private static ApplicationContext ctx;

	public static void main(String[] args) {

		SpringApplication.run(Application2ReadingInfo.class, args);

		// create a shop service
		Shop shop = ctx.getBean(Shop.class);

		// using the shop service
		System.out.println("\n========= ALL CUSTOMERS");
		printCollection(shop.getAllCustomers());

		System.out.println("\n========= ALL Jerusalem CUSTOMERS");
		printCollection(shop.getAllCustomersByCity("Jerusalem"));

		System.out.println("\n========= get CUSTOMER by id");
		System.out.println("customer id = 1: " + shop.getCustomer(1));
		System.out.println("customer id = 100: " + shop.getCustomer(100));

		System.out.println("\n========= ALL ORDERS");
		printCollection(shop.getAllOrders());

		System.out.println("\n========= EXPIRED ORDERS");
		printCollection(shop.getExpiredOrders());

		System.out.println("\n=========  ORDERS DUE in 5 days");
		printCollection(shop.getOrdersDueIn(5));

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
