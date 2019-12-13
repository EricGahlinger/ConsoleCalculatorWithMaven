package ch.bbw.erga.consolecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test cases for Calculator class
 * 
 * @author eric.gahlinger
 * @version 29.11.2019
 */
public class CalculatorTest {
	private Calculator testee;

	@Before
	public void setUp() {
		testee = new Calculator();
	}
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 20) == 30);
	}
	
	@Test
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.summe(-10, -20) == -30);
	}
	
	@Test
	public void testSummeEineNegativeUndEinePositiveIsOk() {
		assertTrue(testee.summe(-4, 13) == 9);
	}
	
	@Test
	public void testSummeMaxValueUndPositiveIsOk() {
		assertTrue(testee.summe(Integer.MAX_VALUE, 15) == -2147483634);
	}
	
	@Test
	public void testSummeMinValueUndPositiveIsOk() {
		assertTrue(testee.summe(Integer.MIN_VALUE, 10) == -2147483638);
	}
	
	@Test
	public void testSummeEineNegativeUndNullIsOk() {
		assertTrue(testee.summe(0, 15) == 15);
	}
	
	@Test
	public void testSummeEineNegativeUndEinePositiveIsGreaterThenZero() {
		assertTrue(testee.summe(-12, 15) > 0);
	}
	
	@Test
	public void testSummeEineNegativeUndEinePositiveIsLessThenZero() {
		assertTrue(testee.summe(-20, 3) < 0);
	}
	
	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(20, 10) == 10);
	}
	
	@Test
	public void testSubtraktionZweiNegativeIsOk() {
		assertTrue(testee.subtraktion(-20, -10) == -10);
	}
	
	@Test
	public void testSubtraktionEineNegativeUndEinePositiveIsOk() {
		assertTrue(testee.subtraktion(20, -10) == 30);
	}
	
	@Test
	public void testSubtraktionMaxValueUndPositiveIsOk() {
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, 10) == 2147483637);
	}
	
	@Test
	public void testSubtraktionMinValueUndNegativeIsOk() {
		assertTrue(testee.subtraktion(Integer.MIN_VALUE, -10) == -2147483638);
	}
	
	@Test
	public void testSubtraktionPositiveUndNullIsOk() {
		assertTrue(testee.subtraktion(10, 0) == 10);
	}
	
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(20, 10) == 2);
	}
	
	@Test
	public void testDivisionEinePositiveEineNegativeIsGreaterThenZero() {
		assertTrue(testee.division(32, 30) > 0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivisionDurchZeroIsNOk() {
		testee.division(20, 0);
	}
	
	@Test
	public void testWurzelProtectedEinePositiveOk() {
		assertTrue(testee.sqrRoot(4) == 2);
	}
	
	@Test
	public void testMultiplikationPackageZweiPositiveOk() {
		assertTrue(testee.muliplikation(6, 4) == 24);
	}
	
	/*
	 * Diese Methode kann nicht getestet werde, da sie privat ist.
	 */
	@Ignore
	@Test
	public void testQuadrierenPrivateZweiPositiveNOk() {
		//assertTrue(testee.quadrieren(6) == 36);
	}
	
	

}
