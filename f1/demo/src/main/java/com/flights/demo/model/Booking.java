package com.flights.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "bookings")
@Data
public class Booking {
	
	@Id
	public Integer bookingId;
	
	@OneToMany
	@JoinColumn(name = "passengerId")
	private Passenger passenger;
	
	@OneToMany
	@JoinColumn(name = "flightId")
	private Flight flight;

}
