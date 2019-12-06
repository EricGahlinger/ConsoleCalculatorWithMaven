package ch.bbw.erga.consolecalculator;

/**
 * 
 * @author eric.gahlinger
 * @version 27.09.2019
 */

public class Calculator {
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}

	public int subtraktion(int value1, int value2) {
		return value1 - value2;
	}
	
	public int division(int value1, int value2) {
		return value1 / value2;
	}
	
	protected double sqrRoot(int value) {
		return Math.sqrt(value);
	}
	
	int muliplikation(int value1, int value2) {
		return value1 * value2;
	}
}
