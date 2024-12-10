package project;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			if (i == 8) {
				break;//to exit it loops stop
			}
			System.out.println("Number: " + i);
		}

	}
}
