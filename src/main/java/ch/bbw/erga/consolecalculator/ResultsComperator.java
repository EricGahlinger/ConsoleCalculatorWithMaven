package ch.bbw.erga.consolecalculator;

import java.util.Comparator;

public class ResultsComperator implements Comparator<Double> {

	@Override
	public int compare(Double r1, Double r2) {
		return r1 < r2 ? -1 : r1 == r2 ? 0 : 1;
	}

}
