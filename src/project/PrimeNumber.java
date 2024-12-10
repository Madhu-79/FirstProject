package project;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 22;
		boolean isprime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				isprime = false;
			}

		}
		if (isprime) {
			System.out.println(num + " its a prime number");
		} else {
			System.out.println(num + " its not a prime number");
		}
	}

}
