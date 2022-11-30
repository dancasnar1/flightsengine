package com.flights.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Entity
@Document(collection = "flights")
public class Flight {
	
	@Id
	public Integer flightId;
	
	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Integer getLayover() {
		return layover;
	}

	public void setLayover(Integer layover) {
		this.layover = layover;
	}

	public Boolean getLuggage() {
		return luggage;
	}

	public void setLuggage(Boolean luggage) {
		this.luggage = luggage;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "company")
	@NotEmpty
	public String company;
	
	@Column(name = "origin")
	@NotEmpty
	public String origin;
	
	@Column(name = "destination")
	@NotEmpty
	public String destination;
	
	@Column(name = "flightNumber")
	@NotEmpty
	public String flightNumber;
	
	@Column(name = "trip")
	public Trip trip;
	
	@Column(name = "departureTime")
	@NotEmpty
	public LocalDateTime departureTime;
	
	@Column(name = "arrivalTime")
	@NotEmpty
	public LocalDateTime arrivalTime;
	
	@Column(name = "layover")
	@NotEmpty
	public Integer layover;
	
	@Column(name = "luggage")
	@NotEmpty
	public Boolean luggage;
	
	@Column(name = "price")
	@NotEmpty
	public Double price;

	public Flight(Integer flightId, @NotEmpty String company, @NotEmpty String origin, @NotEmpty String destination,
			@NotEmpty String flightNumber, Trip trip, @NotEmpty LocalDateTime departureTime,
			@NotEmpty LocalDateTime arrivalTime, @NotEmpty Integer layover, @NotEmpty Boolean luggage,
			@NotEmpty Double price) {
		super();
		this.flightId = flightId;
		this.company = company;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.trip = trip;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.layover = layover;
		this.luggage = luggage;
		this.price = price;
	}
}
