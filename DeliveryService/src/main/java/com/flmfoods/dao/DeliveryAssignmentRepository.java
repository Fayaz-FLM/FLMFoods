package com.flmfoods.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.flmfoods.model.DeliveryAssignment;

public interface DeliveryAssignmentRepository extends JpaRepository<DeliveryAssignment, Long> {
}

