package com.pilati2.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pilati2.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
