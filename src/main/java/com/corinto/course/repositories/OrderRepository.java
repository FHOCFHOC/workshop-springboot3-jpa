package com.corinto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corinto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}