package project;
class Carclass {
	void cartype() {
		System.out.println("there are more model");
	}

}

class model extends Carclass {
	void modeltype() {
		System.out.println("model is bmw");
	}
}

class colour extends model {
	void colourtype() {
		System.out.println("colour is white");
	}
}

public class Inherit1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		colour clr=new colour();
		clr.cartype();
		clr.colourtype();
		clr.modeltype();
	}

}
