package com.example.oneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oneToOne.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
