import java.util.Scanner;

public class HeightConverterApp {
public static void main(String[] args) {
	HeightConverter converter = new HeightConverter();
	Scanner input = new Scanner(System.in);  
	System.out.print("Enter height :- ");
	System.out.printf("%.1f",converter.convertInchesToFeet(input.nextDouble()));
	input.close();
}
}
