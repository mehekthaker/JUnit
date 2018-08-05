package com.TaxCalculatorTest;

public class CountryNotValidException extends Exception {

	//Exception thrown when the Country name entered is not India
	public CountryNotValidException(String message)
	{
		super(message);
	}
	
}
