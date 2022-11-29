package com.flights.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "flights")
@Data
public class Flight {
	
	@Id
	public Integer flightId;
	
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
	
}
