package com.eldar.spring.core;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.eldar.spring.core.enitites.Customer;
import com.eldar.spring.core.enitites.Order;
import com.eldar.spring.core.services.Shop;

@SpringBootApplication
public class Application1CreateCustomers implements ApplicationContextAware {

	private static ApplicationContext ctx;

	public static void main(String[] args) {

		SpringApplication.run(Application1CreateCustomers.class, args);

		// create a shop service
		Shop shop = ctx.getBean(Shop.class);

		// create customers and orders
		Customer c1 = new Customer("Yoel", "Tel Aviv", "Ben Gurion");
		c1.addOrder(new Order("aaa", LocalDate.now().plusDays(5)));
		c1.addOrder(new Order("bbb", LocalDate.now().plusDays(10)));
		c1.addOrder(new Order("ccc", LocalDate.now().minusDays(2)));

		Customer c2 = new Customer("Dina", "Jerusalem", "Begin");
		c2.addOrder(new Order("ddd", LocalDate.now().plusDays(5)));
		c2.addOrder(new Order("eee", LocalDate.now().plusDays(10)));
		c2.addOrder(new Order("fff", LocalDate.now().minusDays(3)));

		Customer c3 = new Customer("Liat", "Jerusalem", "Herzel");
		c3.addOrder(new Order("ddd", LocalDate.now().plusDays(5)));
		c3.addOrder(new Order("eee", LocalDate.now().plusDays(100)));
		c3.addOrder(new Order("fff", LocalDate.now().plusDays(5)));

		// add customers
		shop.addCustomer(c1);
		shop.addCustomer(c2);
		shop.addCustomer(c3);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}

}
