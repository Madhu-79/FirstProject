package project;

public class Calculatormethod {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatormethod calculator = new Calculatormethod();
		int num1 = 10;
		int num2 = 5;
		int sum = calculator.add(num1, num2);
		int difference = calculator.subtract(num1, num2);
		int product = calculator.multiply(num1, num2);
		double quotient = calculator.divide(num1, num2);

		System.out.println("Sum " + sum);
		System.out.println("difference " + difference);
		System.out.println("product " + product);
		System.out.println("Quotient " + quotient);
	}

}
