package com.flights.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.demo.model.Flight;
import com.flights.demo.model.Trip;
import com.flights.demo.repository.FlightRepository;
import org.springframework.context.annotation.Bean;

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
	/*
	public List<Flight> findByOrigin(String origin){
		return flightRepository.findByOrigin(origin);
	}
	
	public List<Flight> findByDestination(String origin, String destination){
		return flightRepository.findByDestination(origin, destination);
	}
	
	public List<Flight> findByTrip(String origin, String destination, Trip trip){
		return flightRepository.findByTrip(origin, destination, trip);
	}
	*/
	
}
