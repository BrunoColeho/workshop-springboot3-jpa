package com.brunostests.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunostests.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
