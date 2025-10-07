package com.flmfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flmfoods.model.DeliveryAssignment;

@Repository
public interface DeliveryAssignmentDao extends JpaRepository<DeliveryAssignment, Long> {

}
