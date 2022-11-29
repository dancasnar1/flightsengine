package com.flights.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.flights.demo.model.Flight;
import com.flights.demo.service.FlightService;

@Controller
public class FlightController {

	@Autowired
	FlightService flightService;
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights(){
		return flightService.findAll();
	}
}
