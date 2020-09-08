package com.eldar.spring.core.enitites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String city;
	private String street;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private List<Order> orders;

	// CTORs
	public Customer() {
	}

	public Customer(String name, String city, String address) {
		this(null, name, city, address);
	}

	public Customer(Integer id, String name, String city, String street) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.street = street;
	}

	// adding an order
	public void addOrder(Order order) {
		if (this.orders == null) {
			this.orders = new ArrayList<Order>();
		}
		this.orders.add(order);
	}

	// other methods

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", street=" + street + "]";
	}

}
