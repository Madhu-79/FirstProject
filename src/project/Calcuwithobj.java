package project;

public class Calcuwithobj {
	public int add(int n1, int n2) {
		int r = n1 + n2;
		return r;
	}
	public int sub(int s1,int s2) {
		int sub=s1-s2;
		return sub;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcuwithobj calci = new Calcuwithobj();
		int result = calci.add(5, 7);
		System.out.println(result);
		int subtraction=calci.sub(467, 89);
		System.out.println(subtraction);
	}

}
