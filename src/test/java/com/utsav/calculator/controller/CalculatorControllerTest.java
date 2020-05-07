package com.utsav.calculator.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.utsav.calculator.controller.CalculatorController;

public class CalculatorControllerTest {

	private String enquoteWithDoubleQuotes(String input) {
		String res="\""+input+"\"";
		return res;
	}
	
	@Test
    public void testCalculateForAddition() throws Exception {
    	String expression="7+8";
        assertEquals("15", new CalculatorController().calculate(enquoteWithDoubleQuotes(expression)));
    }
	
	@Test
    public void testCalculateForSubstraction() throws Exception {
    	String expression="7-8";
        assertEquals("-1", new CalculatorController().calculate(enquoteWithDoubleQuotes(expression)));
    }
	
	@Test
    public void testCalculateForMultiplication() throws Exception {
    	String expression="7*8";
        assertEquals("56", new CalculatorController().calculate(enquoteWithDoubleQuotes(expression)));
    }
	
	@Test
    public void testCalculateForDivision1() throws Exception {
    	String expression="10/3";
        assertEquals("3.33333", new CalculatorController().calculate(enquoteWithDoubleQuotes(expression)));
    }
	
	@Test
    public void testCalculateForDivision2() throws Exception {
    	String expression="5/2";
        assertEquals("2.5", new CalculatorController().calculate(enquoteWithDoubleQuotes(expression)));
    }
}
