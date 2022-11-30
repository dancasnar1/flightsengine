package com.flights.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.demo.model.Flight;
import com.flights.demo.model.Trip;
import com.flights.demo.repository.FlightRepository;

@Service
public class FlightService {

	private FlightRepository flightRepository;
	
	@Autowired
	public FlightService(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}
	
	public List<Flight> findAll(){
		return flightRepository.findAll();
	}
	
	public List<Flight> findByOrigin(String origin){
		return flightRepository.findByOrigin(origin);
	}
	
	public List<Flight> findByDestination(String origin, String destination){
		return flightRepository.findByDestination(origin, destination);
	}
	
	public List<Flight> findByTrip(String origin, String destination, Trip trip){
		return flightRepository.findByTrip(origin, destination, trip);
	}
	public List<Flight> findByDepartureTime(String origin, String destination, Trip trip, LocalDateTime departureTime){
		return flightRepository.findByDepartureTime(origin, destination, trip, departureTime.toLocalDate().minusDays(3),
				departureTime.toLocalDate().plusDays(3));
	}
	
}
