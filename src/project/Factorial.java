package project;

public class Factorial {

		public static int fact(int n) {
			if(n==0) {
				return 1;
			}
				else {
					return n*fact(n=1);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("factorial is" + fact(n));
	}

}
