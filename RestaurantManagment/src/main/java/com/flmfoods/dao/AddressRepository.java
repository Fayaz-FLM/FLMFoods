package com.flmfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flmfoods.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
