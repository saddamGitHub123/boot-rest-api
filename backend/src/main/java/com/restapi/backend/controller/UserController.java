package com.restapi.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.backend.dao.UserDAO;
import com.restapi.backend.model.User;
/**
 * @author Sk Saddam Hosan
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@PostMapping("/save")
	public @ResponseBody User saveUser(@RequestBody User user) {
		
		userDAO.save(user);
		
		return user;
	}
	
	
	@GetMapping("/getuser")
	public @ResponseBody List<User> getUser(){
		
		List<User> userList = userDAO.getUserValue();
		
		return userList;
		
	}

}

