package com.eldar.spring.core.enitites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private LocalDate supplyDate;

	// CTORs
	public Order() {
	}

	public Order(String description, LocalDate supplyDate) {
		this(null, description, supplyDate);
	}

	public Order(Integer id, String description, LocalDate supplyDate) {
		super();
		this.id = id;
		this.description = description;
		this.supplyDate = supplyDate;
	}

	// other methods

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getSupplyDate() {
		return supplyDate;
	}

	public void setSupplyDate(LocalDate supplyDate) {
		this.supplyDate = supplyDate;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", description=" + description + ", supplyDate=" + supplyDate + "]";
	}

}
