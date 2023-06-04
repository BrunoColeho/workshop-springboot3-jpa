package com.brunostests.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunostests.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
