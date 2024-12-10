package project;

import java.util.Scanner;

public class Invertedpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		for (int i = rows; i > 0; i--) {

			// Print spaces for alignment
			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}

			// Print stars for the pyramid
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("7");
			}

			// Move to the next line after each row
			System.out.println();
		}

		scanner.close();
	}
}
