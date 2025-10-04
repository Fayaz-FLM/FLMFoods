package com.flmfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flmfoods.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
