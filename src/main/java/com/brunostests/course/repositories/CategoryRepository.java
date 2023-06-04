package com.brunostests.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunostests.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
