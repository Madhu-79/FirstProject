package project;
import java.util.Scanner;

public class Palindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//mam=mam
		//using in methods ->string builder
		
		//to lowercase
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string");
		String input=scanner.nextLine();
		
		String reversed=new StringBuilder(input).reverse().toString();
		if(input.equals(reversed)) {
			System.out.println(input+ " is a palindrome");
		}
		else {
			System.out.println(input +" jis not a palindrome");
		}
		scanner.close();
	}
	

}
