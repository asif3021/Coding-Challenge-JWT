package com.assessmentuserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessmentuserservice.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

}
