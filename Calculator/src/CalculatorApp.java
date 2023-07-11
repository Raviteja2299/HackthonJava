
public class CalculatorApp {
public static void main(String[] args) {
	Calculator calculator = new Calculator();
	System.out.println("Welcome to the calculator");
	
	whileLoop: 
		while(true) {
		char operator = calculator.getInput();
		switch (operator) {
		case '+':
			calculator.add();
			break;
		case '-':
			calculator.sub();
			break;
		case '/':
			calculator.div();
			break;
		case '%':
			calculator.rem();
			break;
		case '*':
			calculator.mul();
			break;
		case '^':
			calculator.sq();
			break;
		case '!':
			System.out.println("Bye Bye......");
			break whileLoop;

		default:
			System.out.println("Choose form the above options\n=====================================");
			break;
		}
	}
}
}
