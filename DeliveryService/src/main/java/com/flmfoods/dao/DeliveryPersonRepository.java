package com.flmfoods.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.flmfoods.model.DeliveryPerson;

public interface DeliveryPersonRepository extends JpaRepository<DeliveryPerson, Long> {
}

