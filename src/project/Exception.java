package project;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter num 1");
int num1=scanner.nextInt();

System.out.println("enter num 2");
int num2=scanner.nextInt();
int sum=num1+num2;
int quotient=0;
try {
	quotient=num1/num2;
}
catch(ArithmeticException  e){
	System.out.println("division by zero is not possible please enter other number");
	System.out.println("exc mess"+ e.getMessage() );
}
System.out.println("the sum is " +sum);

System.out.println("quotient is " + quotient);

	}
}
