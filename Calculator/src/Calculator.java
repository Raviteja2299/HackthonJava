import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	int a, b;

	char getInput() {
		System.out.print(
				"Enter the following :- \n + for addition \n - for subtraction \n / for Division\n * for multiplicatoin\n ^ for square % for reminder \n ! for exit. \nEnter your option :- ");
		char operator = sc.next().charAt(0);
		return operator;
	}

	void getNumbers() {
		System.out.println("Enter two number :- ");
		this.a = sc.nextInt();
		this.b = sc.nextInt();
	}

	public void add() {
		getNumbers();
		System.out.println(a + b);
	}

	public void sub() {
		getNumbers();
		System.out.println(a - b);

	}

	public void div() {
		getNumbers();
		// TODO Auto-generated method stub
		System.out.println(a / b);
	}

	public void rem() {

		getNumbers();
		System.out.println(a % b);

	}

	public void sq() {
		int temp = sc.nextInt();
		// TODO Auto-generated method stub
		System.out.println(temp * temp);

	}

	public void mul() {
		// TODO Auto-generated method
		getNumbers();
		System.out.println(a * b);

	}
}
