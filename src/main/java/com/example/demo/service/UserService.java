package com.example.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserModel;
import com.example.demo.repository.UserRepository;

import java.util.*;
@Service("userService")
public class UserService {

	@Resource(name="userRepository")
	private UserRepository userRepository;
	
	public UserModel save(UserModel userModel) {
		return	userRepository.save(userModel);
		
	}
	
	public List<UserModel> getList(){
		return userRepository.findAll();
		
	}
	
	public List<UserModel> getAges(String dateOfbirth){
		return userRepository.getAges(dateOfbirth);
		
	}
}
