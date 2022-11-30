package com.flights.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flights.demo.model.Flight;
import com.flights.demo.model.Trip;
import com.flights.demo.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	FlightService flightService;
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights(){
		return flightService.findAll();
	}
	
	@GetMapping("/flights/{origin}")
	public List<Flight> getAllFlightsFilterByOrigin(@PathVariable(name = "origin") String origin){
		return flightService.findByOrigin(origin);
	}
	
	@GetMapping("/flights/{origin}/{destination}")
	public List<Flight> getAllFlightsFilterByDestination(@PathVariable(name = "origin") String origin,
			@PathVariable(name = "destination") String destination){
		return flightService.findByDestination(origin, destination);
	}
	
	@GetMapping("/flights/{origin}/{destination}/{trip}")
	public List<Flight> getAllFlightsFilterByTrip(@PathVariable(name = "origin") String origin,
			@PathVariable(name = "destination") String destination, @PathVariable(name = "trip") Trip trip){
		return flightService.findByTrip(origin, destination, trip);
	}
	
	@GetMapping("/flights/{origin}/{destination}/{trip}/{departureTime}")
	public List<Flight> getAllFlightsFilterByDeparture(@PathVariable(name = "origin") String origin,
			@PathVariable(name = "destination") String destination, @PathVariable(name = "trip") Trip trip,
			@PathVariable(name = "departureTime") LocalDateTime departureTime){
		return flightService.findByDepartureTime(origin, destination, trip, departureTime);
	}
}
