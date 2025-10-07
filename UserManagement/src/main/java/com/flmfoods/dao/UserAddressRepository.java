package com.flmfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flmfoods.model.UserAddress;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{

}
