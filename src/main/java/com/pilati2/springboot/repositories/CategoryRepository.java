package com.pilati2.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pilati2.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
