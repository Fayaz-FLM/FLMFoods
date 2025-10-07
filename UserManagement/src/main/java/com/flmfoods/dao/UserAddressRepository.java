package com.flmfoods.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.flmfoods.model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long> {
	
}

