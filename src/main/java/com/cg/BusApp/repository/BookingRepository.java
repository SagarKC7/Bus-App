package com.cg.BusApp.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.BusApp.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	Booking findByUsername(String username);



}
