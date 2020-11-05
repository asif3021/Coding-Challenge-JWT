package com.assessmentuserservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessmentuserservice.model.UserInfo;
import com.assessmentuserservice.service.UserInfoService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	@Autowired
	UserInfoService userInfoService;
	
	@GetMapping("/get/all")  
	private List<UserInfo> getAllUser() {  
		return userInfoService.getAllUserInfo();  
	}  
	
	@GetMapping("/get/{id}")  
	private UserInfo getUserInfo(@PathVariable("id") int id) {  
		return userInfoService.getUserInfoById(id);  
	}
	 
	@DeleteMapping("/delete/{id}")
	private String deleteUser(@PathVariable("id") int id) {  
		userInfoService.delete(id);
		return "User info successfully deleted - " + id;
	}
	
	@ResponseBody
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	private int saveUserInfo(@RequestBody UserInfo userInfo) {  
		userInfoService.saveOrUpdate(userInfo);  
	return userInfo.getId();
	}  
	
	@PutMapping("/update/{id}")
	private String updateUserInfo(@RequestBody UserInfo userInfo, @PathVariable("id") int id) {
		userInfo.setId(id);
		userInfoService.saveOrUpdate(userInfo);
	return "User info successfully updated - " + userInfo.getId();
	}  
	

}
