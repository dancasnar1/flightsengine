package com.flights.demo;

import java.time.LocalDateTime;

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
	}

	@Override
	public void run(String... args) throws Exception {
		fr.save(new Flight(6,"BBB","sev","bar","maa28943", Trip.ONE_WAY, LocalDateTime.of(2022, 12, 2, 10, 00, 00), null, null, null, null));
//		fr.save(new Flight(2,"BBB","mad","sev","maa28943", Trip.ONE_WAY, null, null, null, null, null));
//		fr.save(new Flight(5,"BBB","sev","bar","maa28943", Trip.ONE_WAY, LocalDateTime.now(), null, null, null, null));
//		fr.save(new Flight(6,"BBB","sev","bar","maa28943", Trip.ONE_WAY, LocalDateTime.of(2022, 12, 1, 10, 00, 00), null, null, null, null));
//		fr.save(new Flight(7,"BBB","sev","bar","maa28943", Trip.ONE_WAY, LocalDateTime.of(2022, 12, 5, 10, 00), null, null, null, null));
//		fr.save(new Flight(8,"BBB","sev","bar","maa28943", Trip.ONE_WAY, LocalDateTime.of(2022, 12, 10, 10, 00), null, null, null, null));
//		fr.save(new Flight(9,"BBB","sev","bar","maa28943", Trip.ONE_WAY, LocalDateTime.of(2022, 12, 20, 0, 00), null, null, null, null));
	}
}