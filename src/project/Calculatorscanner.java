package project;
import java.util.Scanner;
public class Calculatorscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter first number");
double num1=scanner.nextDouble();

System.out.println("enter second number");
double num2=scanner.nextDouble();

System.out.println("choose operation(+ , -,*,/)");
char operator=scanner.next().charAt(0);

double result = 0;
switch(operator)
{
case'+':
	result=num1+num2;
	break;
case'-':
	result=num1-num2;
	break;
case'*':
	result=num1*num2;
	break;
case'/':
	result=num1/num2;
	break;
	default:
		System.out.println("enter a valid operator to perform");
}
System.out.println("the result is :" + result  + num1 +operator+ num2 + "="+ result);
	}

}
