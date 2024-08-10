package com.pilati2.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pilati2.springboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
