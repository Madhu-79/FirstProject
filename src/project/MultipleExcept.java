package project;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);

try {
System.out.println("enter a number 1");
int num1 =scanner.nextInt();

System.out.println("enter a number 2");
int num2=scanner.nextInt();

int result=num1/num2;
	}
catch(InputMismatchException |ArithmeticException e) {
	System.out.println("exception");
	//System.out.println("enter valid format ex:number");
	//System.out.println("exception:division by zero");
}
/*catch(ArithmeticException e) {
	System.out.println("exception:division by zero");
}*/

	}
}
