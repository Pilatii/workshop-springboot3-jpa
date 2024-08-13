package com.pilati2.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pilati2.springboot.entities.OrderItem;
import com.pilati2.springboot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
