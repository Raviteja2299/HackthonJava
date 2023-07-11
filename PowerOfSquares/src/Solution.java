import java.util.Scanner;

public class Solution {
	public static int squareNumber(int num) {
		return num*num;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:- ");
		System.out.println(squareNumber(input.nextInt()));
		
		input.close();
	}
}
