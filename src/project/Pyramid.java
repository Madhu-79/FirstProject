package project;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Number of rows for the pyramid
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			// Print spaces for alignment
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Print stars for the pyramid
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			// Move to the next line after each row
			System.out.println();
		}

		scanner.close();
	}
}
