package ch.bbw.erga.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
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
	public void testSubtraktionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(20, 10) == 10);
	}
	
	@Test
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.summe(-10, -20) == -30);
	}
	
	@Test
	public void testSubtraktionZweiNegativeIsOk() {
		assertTrue(testee.subtraktion(-20, -10) == -10);
	}
	
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(20, 10) == 2);
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

}
