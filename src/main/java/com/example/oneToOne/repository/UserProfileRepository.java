package com.example.oneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oneToOne.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long>{

}
