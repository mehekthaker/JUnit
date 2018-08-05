package com.TaxCalculatorTest;

public class TaxNotEligibleException extends Exception {

	//Exception thrown when the employee's salary does not satisfy the criteria to pay tax
	public TaxNotEligibleException(String message)
	{
		super(message);
	}
	
}
