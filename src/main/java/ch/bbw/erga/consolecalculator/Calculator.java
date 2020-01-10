package ch.bbw.erga.consolecalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Calculator
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
				if (calculationString.contains("x*x")) {
					if (calculationString.contains("x")) {
						String[] strA = calculationString.split("x*x");
						// String[] strB = strA[1].split("x");

						if (strA[0].isEmpty()) {
							a = 1;
						} else {
							a = Double.parseDouble(strA[0]);
						}
						if (strA[2].isEmpty()) {
							b = 1;
						} else {
							b = Double.parseDouble(strA[2]);
						}
						c = Double.parseDouble(strA[3]);

						if (a == 0) {
							throw new IllegalArgumentException("Wrong format (a: can't be 0)");
						} else if ((b * b - 4 * a * c) == 0) {
							results.add(-b / (2 * a));
						} else if (b * b - 4 * a * c < 0) {
							return results;
						} else {
							results.add((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
							results.add((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
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
		} catch (

		NumberFormatException n) {
			throw new IllegalArgumentException(n.getMessage());
		}
	}
}
