package project;
public class Person {
	String name;
	int age;

	Person(String x, int y) {
		this.name = x;
		this.age = y;
	       }

	void greet() {

		System.out.println("hello " + name + "age: is " + age);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("");
		Person p2 = new Person("xyz", 65);
		p1.greet();
		p2.greet();
	}
	}



