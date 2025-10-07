package com.flmfoods.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.flmfoods.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

