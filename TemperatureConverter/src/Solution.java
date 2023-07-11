import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	TemperatureConverter tempConverter = new TemperatureConverter();
	Scanner input= new Scanner(System.in);
	
	System.out.println("Fahrenheit to Celsius Converter ");
	System.out.print("Enter teperature in Fahrenheit :- ");
	System.out.printf("%.2f ",tempConverter.convertFahrenheitToCelsius(input.nextDouble()));
	
	input.close();
}
}
