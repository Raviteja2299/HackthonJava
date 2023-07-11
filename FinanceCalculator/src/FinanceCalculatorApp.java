import java.util.Scanner;

public class FinanceCalculatorApp {
public static void main(String[] args) {
	FinanceCalculator calculator = new FinanceCalculator();
	Scanner input = new Scanner(System.in);
	
	double 
	principal = input.nextDouble(),
	rate = input.nextDouble(),
	time = input.nextDouble();
	System.out.println(calculator.calculateSimpleInterest(principal,rate, time));
	input.close();
}
}
