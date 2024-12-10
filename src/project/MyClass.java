package project;

public class MyClass {
	public int number;
	 String text;

	public MyClass() {
		this.number = 0;
		this.text = "Default";
	}

	public int getNumber() {
		return number;
	}

	public String getText() {
		return text;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		System.out.println("Number:" + obj.getNumber());
		System.out.println("text " + obj.getText());

	}

}
