import java.util.Scanner;

public class HalveItApp {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter amount for splitting bills :- ");
		System.out.printf("%.1f", halveTheNumber(input.nextDouble()));
		input.close();
	}
	static double halveTheNumber(double Amount) {
		return Amount/2.0;
	}

}
