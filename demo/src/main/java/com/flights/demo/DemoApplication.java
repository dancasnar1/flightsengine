package com.flights.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.flights.demo.controller.FlightController;
import com.flights.demo.model.Flight;
import com.flights.demo.model.Trip;
import com.flights.demo.repository.FlightRepository;

@SpringBootApplication
@ComponentScan("com.flights.demo")
@EnableMongoRepositories("com.flights.demo")
@EnableJpaRepositories("com.flights.demo")
@Configuration
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private static FlightRepository fr;
	private static FlightController fc;
	
	@Autowired
	public DemoApplication(FlightRepository fr, FlightController fc) {
		this.fr = fr;
		this.fc = fc;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		 

//		System.out.println("lineejhfhsdhfshfdsfhj 38");
//		if(fr.findAll().isEmpty()) {
//			System.out.println("lineejhfhsdhfshfdsfhj 40");
//			Flight f1 = new Flight(1,"BBB","mad","tia","maa28943",Trip.ONE_WAY, LocalDateTime.now(), 
//					LocalDateTime.of(2022, 12, 12, 18, 00), 0, false, 150.50);
//			System.out.println(f1);
		}

	@Override
	public void run(String... args) throws Exception {
	
		fr.save(new Flight(2,"BBB","mad","tia","maa28943", Trip.ONE_WAY, null, null, null, null, null));
		fr.save(new Flight(5,"BBB","mad","tia","maa28943", Trip.ONE_WAY, null, null, null, null, null));
		
	}
	}
	
	

//}
