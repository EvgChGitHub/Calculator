import java.util.Scanner;
import static java.lang.System.out;

class Calculator {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		out.println("Enter first number:");
		double firstNumber = keyboard.nextDouble();
		out.println("Enter second number:");
		double secondNumber = keyboard.nextDouble();

		out.println("Enter the operation symbol: +, -, * or /");
		char operation = keyboard.findWithinHorizon(".", 0).charAt(0);
		double result = 0.00;

		switch (operation) {
		case '+':
			result = firstNumber + secondNumber;
			break;
		case '-':
			result = firstNumber - secondNumber;
			break;
		case '*':
			result = firstNumber * secondNumber;
			break;
		case '/':
			result = firstNumber / secondNumber;
			break;

		default:
			out.println("No such operation expected");
			break;
		}
		out.println("First number: " + firstNumber);
		out.println("Second number: " + secondNumber);
		out.println("Operation: " + operation);
		out.print(firstNumber + " ");
		out.print(operation + " ");
		out.print(secondNumber + " = ");
		out.println(result);
		out.println("Goodbye");
		keyboard.close();
	}
}
