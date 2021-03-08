package com.cg.BusApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.BusApp.entities.User;
import com.cg.BusApp.exceptions.UserAlreadyExistException;
import com.cg.BusApp.exceptions.UserNotFoundException;
import com.cg.BusApp.repository.UsersRepository;


@Service
public class UsersService {

	@Autowired
UsersRepository usersRepository;
	
	public void addUser(User user) {	
		Optional<User> u = usersRepository.findByUsername(user.getUsername());
		if(u.isEmpty()) 
		{
			usersRepository.save(user);
		}
		else
		{
			throw new UserAlreadyExistException("User already exist");
		}	
		}
	
	public void deleteUser(String s)
	{
	Optional<User> user = usersRepository.findByUsername(s);	
	User u = null;
	if(user.isPresent()) 
	{
		u = user.get();
		usersRepository.delete(u);
	}
	else
	{
		throw new UserNotFoundException("User not Found");
	}
	}
	public void updatePasssword(String s2, String s3)
	{
		Optional<User> u = usersRepository.findByUsername(s2);
		User u2 = null;
		if(u.isPresent())
		{
			u2 = u.get();
			u2.setPassword(s3);
		}
		else
		{
			throw new UserNotFoundException("User not Found");
		}
	}
	public List <User> getAllUsers()
	{
		return usersRepository.findAll();
	}
}