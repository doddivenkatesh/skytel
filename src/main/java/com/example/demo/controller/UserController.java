package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserModel;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	@PostMapping("/save")
	public UserModel save(@RequestBody UserModel user) {
		
		return userService.save(user);
		
	}
	
	@GetMapping("/list")
	public List<UserModel> findAll(){
		return userService.getList();
	}

	@GetMapping("/getAges")
	public List<UserModel> getAges(@RequestParam  String dateOfbirth){
	List<UserModel>	ages= userService.getAges(dateOfbirth);
	return ages;
		
	}
}
