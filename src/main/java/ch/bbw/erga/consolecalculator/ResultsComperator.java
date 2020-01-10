package ch.bbw.erga.consolecalculator;

import java.util.Comparator;
/**
 * ResultsComperator
 * 
 * @author eric.gahlinger
 * @version 10.01.2020
 */
public class ResultsComperator implements Comparator<Double> {

	@Override
	public int compare(Double r1, Double r2) {
		return r1 < r2 ? -1 : r1 == r2 ? 0 : 1;
	}

}
