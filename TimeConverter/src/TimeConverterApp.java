import java.util.Scanner;

public class TimeConverterApp {

	public static double convertToHours(int minutes) {
		return minutes / 60.0;
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter number of minutes :- ");
		
		System.out.printf("%.2f",convertToHours(input.nextInt()));
		input.close();
	}
}
