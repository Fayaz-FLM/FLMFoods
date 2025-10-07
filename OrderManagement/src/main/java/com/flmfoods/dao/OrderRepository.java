package com.flmfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flmfoods.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
