package com.portfolio.swagger2demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.swagger2demo.UserResponse.UserResponse;
import com.portfolio.swagger2demo.model.User;

@RestController
public class UserController {

	
	@GetMapping(value="/users")
	public UserResponse getUsers(HttpServletRequest request ) {
		return new UserResponse(HttpStatus.OK,new User());
	}
}
