package com.flmfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flmfoods.model.OrderItems;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Long>{

}
