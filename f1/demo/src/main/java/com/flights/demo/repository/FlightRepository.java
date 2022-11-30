package com.flights.demo.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.flights.demo.model.*;

import org.springframework.data.repository.query.Param;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FlightRepository extends MongoRepository<Flight, Integer> {
	
	@Query("{}")
	List<Flight> findAll();
	
	@Query("{origin: '?0'}")
	List<Flight> findByOrigin(@Param("origin") String origin);
	
	@Query("{origin: '?0', destination: '?1'}")
	List<Flight> findByDestination(@Param("origin") String origin, @Param("destination") String destination);
	
	@Query("{origin: '?0', destination: '?1', trip: '?2'}")
	List<Flight> findByTrip(@Param("origin") String origin, @Param("destination") String destination, 
			@Param("trip") Trip trip);
	
//	@Query("{origin: '?0', destination: '?1', trip: '?2', "
//			+ "departureTime: { '$gt': { departureTimeEarlier: ISODate('?3') }, '$lt': {departureTimeLater: ISODate('?4')} }}")
	@Query("{origin: '?0', destination: '?1', trip: '?2', "
			+ "departureTime: { $gt: { $date:'?3' }, $lt: { $date:'?4'} }  }")
	List<Flight> findByDepartureTime(@Param("origin") String origin, @Param("destination") String destination, 
			@Param("trip") Trip trip, @Param("departureTimeEarlier") LocalDate departureTimeEarlier, 
			@Param("departureTimeLater") LocalDate departureTimeLater);
//	
//	@Query("SELECT * FROM Flight flight WHERE flight.company = :company")
//	List<Flight> findByCompany(@Param("company") String company);
//	
//	@Query("SELECT * FROM Flight flight WHERE flight.layover >= 1")
//	List<Flight> findByLayover();
//	
//	@Query("SELECT * FROM Flight flight WHERE flight.luggage = true")
//	List<Flight> findByLuggage();
//	
//	@Query("SELECT * FROM Flight flight WHERE flight.departureTime > ?1 and flight.arrivalTime < ?2")
//	List<Flight> findBySchedule(@Param("departureTime") LocalDateTime departureTime, 
//			@Param("arrivalTime") LocalDateTime arrivalTime);
	
}
