package ch.bbw.erga.consolecalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

	private int quadrieren(int value1) {
		return value1 * value1;
	}

	// Einfache Quadratische Gleichung (ax*x + bx + c = 0)
	public List<Double> quadratischeGleichung(String rechnung) throws IllegalArgumentException {
		List<Double> results = new ArrayList<>();
		double a;
		double b;
		double c;
		
		rechnung = rechnung.replaceAll("\\s", "");

		try {
			double zero = Double.parseDouble(rechnung.split("=")[1]);
			String calculationString = rechnung.split("=")[0];
			if (zero == 0.0) {
				String[] variables = new String[3];
				String[] splitVars = calculationString.split("[+]");
				if(splitVars.length != 3) {
					for(int i = 0; i < splitVars.length; i++) {
						if(splitVars[i].contains("-")) {
							String[] var = splitVars[i].split("-");
							variables[i] = var[0];
							variables[i+1] = "-" + var[1];
						} else {
							variables[i] = splitVars[i];
						}
					}
				}
				if(splitVars.length == 3) {
					variables = splitVars;
				}
					if (variables[0].contains("x*x")) {
						if (variables[1].contains("x")) {
							if (!variables[2].contains("x")) {
								String strA = variables[0].split("x*x")[0];
								String strB = variables[1].split("x")[0];
								
								if(strA.isEmpty()) {
									a = 1;
								} else {
									a = Double.parseDouble(strA);
								}
								if(strB.isEmpty()) {
									b = 1;
								} else {
									b = Double.parseDouble(strB);
								}
								c = Double.parseDouble(variables[2]);
								
								if(a == 0) {
									return results;
								} else if(b*b - 4*a*c <= 0) {
									results.add(-b / (2*a));
								} else {
									results.add((-b + Math.sqrt(b*b - 4*a*c)) / (2*a));
									results.add((-b - Math.sqrt(b*b - 4*a*c)) / (2*a));
								}
							} else {
								throw new IllegalArgumentException("Wrong format (c: x is wrong)");
							}
						} else {
							throw new IllegalArgumentException("Wrong format (b: x is missing)");
						}
					} else {
						throw new IllegalArgumentException("Wrong format (a: x*x is missing)");
					}
					Collections.sort(results, new ResultsComperator());
						
				return results;
			} else {
				throw new IllegalArgumentException("Wrong format (= 0 is missing)");
			}
		}catch(

	NumberFormatException n)
	{
		throw new IllegalArgumentException(n.getMessage());
	}
}}
