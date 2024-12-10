package project;

public class Overloading {

	public static int add(int a,int b) {
	return a+b;
	}
	
	public static int add(int a,int b,int c) {
	return a+b+c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=78;
		 int num2 =89;
		 int num3=765;
int result=add(num1, num2);
int add3=add(num1,num2,num3);
System.out.println("addition of 2 numbers=" + result);
System.out.println("addition of 3 numbers=" + add3);
	}

}
