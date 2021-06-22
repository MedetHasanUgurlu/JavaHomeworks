package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.UserService;

import com.medet.hmrs.entities.concretes.User;

@RestController
@RequestMapping("api/users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@RequestMapping("/getall")
	List<User> getAll(){
		return userService.getAll();

	}
	
	
	
	
	
	
}
