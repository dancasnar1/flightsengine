package com.flights.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.flights.demo.model.Flight;
import com.flights.demo.model.Trip;

import org.springframework.data.jpa.repository.Query;

public interface FlightRepository extends Repository<Flight, Integer> {
	
	@Query("SELECT * FROM Flight flight")
	List<Flight> findAll();
	
	String sql1 = "SELECT * FROM Flight flight WHERE flight.origin = :origin";
	@Query(sql1)
	List<Flight> findByOrigin(@Param("origin") String origin);
	
	String sql2 = sql1 + " and flight.destination = :destination";
	@Query(sql2)
	List<Flight> findByDestination(@Param("origin") String origin, @Param("destination") String destination);
	
	String sql3 = sql2 + " and flight.trip = :trip";
	@Query(sql3)
	List<Flight> findByTrip(@Param("origin") String origin, @Param("destination") String destination, 
			@Param("trip") Trip trip);
	
	@Query("SELECT * FROM Flight flight WHERE flight.departureTime < flight.departureTime - interval '3 day' or "
			+ "flight.departureTime > flight.departureTime + interval '3 day' or "
			+ "flight.departureTime = flight.departureTime")
	List<Flight> findByDepartureTime(@Param("departureTime") LocalDateTime departureTime);
	
	@Query("SELECT * FROM Flight flight WHERE flight.company = :company")
	List<Flight> findByCompany(@Param("company") String company);
	
	@Query("SELECT * FROM Flight flight WHERE flight.layover >= 1")
	List<Flight> findByLayover();
	
	@Query("SELECT * FROM Flight flight WHERE flight.luggage = true")
	List<Flight> findByAllowsLuggage();
	
	@Query("SELECT * FROM Flight flight WHERE flight.departureTime > ?1 and flight.arrivalTime < ?2")
	List<Flight> findBySchedule(@Param("departureTime") LocalDateTime departureTime, 
			@Param("arrivalTime") LocalDateTime arrivalTime);
	
}
