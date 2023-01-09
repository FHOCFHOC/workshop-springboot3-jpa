package com.corinto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corinto.course.entities.OrderItem;
import com.corinto.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}