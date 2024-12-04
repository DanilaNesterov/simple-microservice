package com.example.simple_microservice.repository;

import com.example.simple_microservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
