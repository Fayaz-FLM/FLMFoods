package com.flmfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flmfoods.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
