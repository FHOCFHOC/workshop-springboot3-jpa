package com.corinto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corinto.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
