package com.flights.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flights.demo.model.Booking;
import com.flights.demo.repository.BookingRepository;
import com.flights.demo.repository.FlightRepository;

@Service
public class BookingService {

	private BookingRepository bookingRepository;
	private FlightRepository flightRepository;
	
	@Autowired
	public BookingService(BookingRepository bookingRepository, FlightRepository flightRepository) {
		this.bookingRepository = bookingRepository;
		this.flightRepository = flightRepository;
	}

	@Transactional
	public void saveBooking(Booking booking) {
		bookingRepository.save(booking);
	}
	
}
