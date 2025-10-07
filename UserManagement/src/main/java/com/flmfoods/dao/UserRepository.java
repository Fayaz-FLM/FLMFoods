package com.flmfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flmfoods.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
