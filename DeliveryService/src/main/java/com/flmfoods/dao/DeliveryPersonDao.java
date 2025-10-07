package com.flmfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flmfoods.model.DeliveryPerson;

@Repository
public interface DeliveryPersonDao extends JpaRepository<DeliveryPerson, Long> {

}
