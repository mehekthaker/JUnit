package com.TaxCalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TaxCalculatorTest {

	//Test case when country is not "India"
	@Test(expected = CountryNotValidException.class)
	public void testCase1() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException{
		TaxCalculator taxCalculator = new TaxCalculator("Ron", 34000, false);
		double tax = taxCalculator.getTaxAmount();
	}
	
	//Test case where employee salary is too low for tax payment
	@Test(expected = TaxNotEligibleException.class)
	public void testCase2() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException{
		TaxCalculator taxCalculator = new TaxCalculator("Tim", 1000, true);
		double tax = taxCalculator.getTaxAmount();
	}
	
	//Test case where tax calculation is checked
	@SuppressWarnings("deprecation")
	@Test
	public void testCase3() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException{
		TaxCalculator taxCalculator = new TaxCalculator("Jack", 55000, true);
		double tax = taxCalculator.getTaxAmount();
		Assert.assertEquals(3300, tax, 0);
	}

	//Test case where the employee name is null 
	@Test(expected = EmployeeNameInvalidException.class)
	public void testCase4() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException{
		TaxCalculator taxCalculator = new TaxCalculator("", 30000, true);
		double tax = taxCalculator.getTaxAmount();
	}
	
}
