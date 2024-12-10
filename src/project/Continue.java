package project;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i = 1; i <= 10; i++) {
           
            if (i % 2 == 0) {
                continue; // If the number is even,to skip
            }

            System.out.println(i);
        }
    }
}
	

