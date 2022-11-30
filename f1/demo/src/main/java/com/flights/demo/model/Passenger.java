package com.flights.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "passengers")
@Data
public class Passenger {
	
	@Id
	public Integer passengerId;
	
	@Column(name = "name")
	@NotEmpty
	public String name;

	@Column(name = "surname")
	@NotEmpty
	public String surname;
	
	@Column(name = "nationality")
	@NotEmpty
	public String nationality;
	
	@Column(name = "identification")
	@NotEmpty
	public String identification;
	
	@Column(name = "age")
	@NotEmpty
	public Integer age;
}
