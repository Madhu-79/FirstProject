package project;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				  Scanner scan =new Scanner(System.in);
				  System.out.println("Enter the Number");
				  int num = scan.nextInt();
				  int count = 0;
			      if(num == 2) {
			         System.out.println(num + " is a prime number");
			      } else {
			         for(int i = 1; i <= num; i++) {
			            if(num % i == 0) {
			               count++;
			            }
			         }
			         if(count == 2) {
			            System.out.println(num + " is a prime number");
			         } else {
			            System.out.println(num + " is not a prime number");
			         }
			      }scan.close();}}
	}

}