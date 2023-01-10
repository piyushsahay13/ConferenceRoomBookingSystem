package com.example.mrb;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mrb.repodb.Initializer;

@SpringBootApplication
public class MeetingRoomBooking1Application {
	@Autowired
	private Initializer rep; 
	
	public static void main(String[] args) {
		SpringApplication.run(MeetingRoomBooking1Application.class, args);
	}
	
	@PostConstruct
	public void initializer() {
		rep.buildmployeesRepo();
		rep.buildConfRoomRepo();
	}
}
