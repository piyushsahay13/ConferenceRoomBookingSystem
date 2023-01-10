package com.example.mrb.validation;

public interface MRBValidationService {
	
	public boolean validatemrbEmployee(String emp);
	
	public boolean validtemrbDates(String bookingDate);
	
	public boolean validatemrbTime(String to, String from);
}
