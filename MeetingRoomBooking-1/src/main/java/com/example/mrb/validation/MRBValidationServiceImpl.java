package com.example.mrb.validation;

import java.time.LocalDate;

public class MRBValidationServiceImpl implements MRBValidationService {

	@Override
	public boolean validatemrbEmployee(String emp) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean validtemrbDates(String bookingDate) {
		LocalDate date = LocalDate.parse(bookingDate);
		LocalDate today = LocalDate.now();
		System.out.println("Todays Date=" + today);
		System.out.println("Req Date=" + date);
		if(date.isAfter(today) || date.isBefore(today))
		
		return true;
	}

	@Override
	public boolean validatemrbTime(String to, String from) {
		
		return false;
	}

}
