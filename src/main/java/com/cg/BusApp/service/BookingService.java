package com.cg.BusApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.BusApp.entities.Booking;
import com.cg.BusApp.exceptions.BookingNotFoundException;
import com.cg.BusApp.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository bookingRepository;
	
	public long addBooking(Booking booking) {
		Booking b = bookingRepository.findByUsername(booking.getUsername());
		if(b == null) {
			bookingRepository.save(booking);
		}
		else {
			throw new BookingNotFoundException("Booking already exist");
		}
		return 0;
			}
	
}
