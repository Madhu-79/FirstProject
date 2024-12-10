package project;

abstract class Vehilcle {
	abstract void start();
	abstract void stop();
}
 class Car extends Vehilcle{
	private String model;
	public Car(String model) {
		this.model=model;
	}
	
  @Override void start() {
		System.out.println(model +" is starting");
	}
  

  @Override void stop() {
		System.out.println(model +" is stopping");
	}
  public String getModel() {
	  return model;
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehilcle myCar= new Car("Toyota");
   myCar.start();
   myCar.stop();

	}

}
