package ch.bbw.erga.consolecalculator;

import java.util.ArrayList;
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

		try {
			double zero = Double.parseDouble(rechnung.split("=")[1]);
			String calculationString = rechnung.split("=")[0];
			if (zero == 0.0) {
				String[] variables = calculationString.split("[+-]");

				if (variables.length == 3) {
					if (variables[0].matches("x*x")) {
						if (variables[1].contains("x")) {
							if (!variables[2].contains("x")) {
								
							} else {
								throw new IllegalArgumentException();
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					throw new IllegalArgumentException();
				}

				return results;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (NumberFormatException n) {
			throw new IllegalArgumentException(n.getMessage());
		}
	}
}
