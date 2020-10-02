package com.portfolio.swagger2demo.UserResponse;

import org.springframework.http.HttpStatus;

import com.portfolio.swagger2demo.model.User;

import lombok.Getter;
import lombok.Setter;

public class UserResponse {

	@Getter @Setter
	private HttpStatus status;
	
	@Getter @Setter
	private User user;
	
	public UserResponse(HttpStatus status,User user) {
		this.status = status;
		this.user = user;
	}
}
