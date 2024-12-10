package project;

abstract class Animal {
	abstract void sound();
	void sleep() {
		System.out.println("this animal is sleeping");
	}

class Dog extends Animal{
	@Override void sound() {
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal{
	@Override void sound() {
		System.out.println("cat meows");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal dog =new Dog();
dog.sound();
dog.sleep();
Animal cat=new Cat();
cat.sound();
	}

}
