	package com.cg.BusApp.controllers;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.cg.BusApp.entities.User;
import com.cg.BusApp.service.UsersService;


@RestController
@RequestMapping(path="/users")
public class UsersController {

	@Autowired
	UsersService usersService;
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public void addUser(@RequestBody  User user) 
	{
		usersService.addUser(user);
	}
	
	@DeleteMapping("/{username}")
	@ResponseStatus(HttpStatus.CREATED)
	public void deleteUser (@PathVariable("username") String username) 
	{
	usersService.deleteUser(username);
	}
	
	@GetMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public List <User> getAllUsers()
	{
		return usersService.getAllUsers();
	}
	
	@PutMapping("/update/{username}:{password}")
	@Transactional
	@ResponseStatus(HttpStatus.CREATED)
	public void updatePasssword (@PathVariable("username") String username, @PathVariable("password") String password)
	{
		usersService.updatePasssword(username, password);
	}
}
