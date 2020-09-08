package com.eldar.spring.core.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eldar.spring.core.enitites.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	List<Order> findBySupplyDateBefore(LocalDate supplyDate);

	List<Order> findBySupplyDateIs(LocalDate supplyDate);
}
