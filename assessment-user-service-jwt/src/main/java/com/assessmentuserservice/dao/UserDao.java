package com.assessmentuserservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessmentuserservice.model.LoginInfo;

@Repository
public interface UserDao extends JpaRepository<LoginInfo, Integer> {
	
	LoginInfo findByUsername(String username);
	
}
