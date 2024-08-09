package com.pilati2.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pilati2.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
