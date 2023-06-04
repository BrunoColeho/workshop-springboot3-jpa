package com.brunostests.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunostests.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
