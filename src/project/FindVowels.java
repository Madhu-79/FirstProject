package project;

import java.util.Scanner;
public class FindVowels {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Sentence ");
		String s1 = ip.nextLine();
		int count =0;
		for(int i=0;i<=s1.length()-1;i++) {
            char c = s1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;				
			}
		}
		System.out.println("Number of Vowels in the string : "+count);
		
	}

}