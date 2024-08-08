package com.pilati2.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pilati2.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
