package com.assessmentuserservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessmentuserservice.model.UserInfo;
import com.assessmentuserservice.repository.UserInfoRepository;

@Service
public class UserInfoService {

	@Autowired  
	private UserInfoRepository userInfoRepository;
	
	public List<UserInfo> getAllUserInfo() {  
		List<UserInfo> users = new ArrayList<UserInfo>();  
		userInfoRepository.findAll().forEach(userInfo -> users.add(userInfo));  
		return users;  
	}

	public UserInfo getUserInfoById(int id) { 
		
		return userInfoRepository.findById(id).get();  
	}  
	
	public void saveOrUpdate(UserInfo userInfo) {  
		
		userInfoRepository.save(userInfo);  
	}

	public void delete(int id) {  
		userInfoRepository.deleteById(id);  
	}  

	
}
