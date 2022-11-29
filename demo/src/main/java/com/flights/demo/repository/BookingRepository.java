package com.flights.demo.repository;

import org.springframework.data.repository.Repository;
import com.flights.demo.model.Booking;

public interface BookingRepository extends Repository<Booking, Integer> {

	void save(Booking booking);
	
}
