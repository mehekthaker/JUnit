package com.TaxCalculatorTest;

public class EmployeeNameInvalidException extends Exception {

	//Exception thrown when Employee Name field is kept empty
	public EmployeeNameInvalidException(String message)
	{
		super(message);
	}
	
}
