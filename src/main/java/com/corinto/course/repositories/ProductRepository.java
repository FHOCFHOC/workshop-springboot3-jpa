package com.corinto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corinto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
