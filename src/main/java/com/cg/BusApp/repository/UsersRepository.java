package com.cg.BusApp.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.BusApp.entities.User;


@Repository
public interface UsersRepository extends JpaRepository<User, Integer>{

//	public User findByName(String UserName);

	public Optional<User> findByUsername(String s);

}
