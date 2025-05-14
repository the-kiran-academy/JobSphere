package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.dtos.UserRequestDTO;
import com.jbk.entites.User;
import com.jbk.service.EmployersService;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	@Autowired
	private EmployersService employersService;

	// Registration and Login
	@PostMapping("/register")
	public User registerEmployer(@RequestBody UserRequestDTO userRequest) {
		System.out.println(userRequest);
		User user = employersService.registerEmployer(userRequest);
		return user;
	}

}
