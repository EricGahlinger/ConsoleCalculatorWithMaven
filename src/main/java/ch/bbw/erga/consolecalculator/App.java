package ch.bbw.erga.consolecalculator;

public class App {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int valueA = 0;
		int valueB = 0;
		
		System.out.println("Console Calculator");
		System.out.println("==================");
		System.out.println();
		
		valueA = 10;
		valueB = 20;
		
		System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(10, 20));
		calculator.quadratischeGleichung("0.5x*x - 2x + 2 = 0");
	}

}
