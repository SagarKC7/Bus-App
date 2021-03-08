package com.cg.BusApp.testcases;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.BusApp.entities.User;
import com.cg.BusApp.service.UsersService;

@SpringBootTest
class TestUsers {

	@Autowired
	UsersService userService;
	
	//@Test
	void addUser(){
		User user = new User("Sagar", "Sagar@123");
		userService.addUser(user);
	}
 
	//@Test
	void deleteUser() {
		String s = "Sagar";
		userService.deleteUser(s);
	}
	
	@Test
	void updatePasssword() {
		String s2 = "Sagar";
		String s3 = "Sagar@65432";
		userService.updatePasssword(s2, s3);
	}
}
