package project;

public class Car {
String name ="Aadi";
int modelno;

public  String Carname(){
	return name;
}
public int model(int m)
{
	return m;
}
public static void colour() {
	System.out.println("colour of car: white" );
}
public static void main(String[] args) {

		// TODO Auto-generated method stub
Car mycar=new Car();
String nameofcar=mycar.Carname();
System.out.println("name of car: "+ nameofcar);
colour();
int num=mycar.model(9874756);
System.out.println("model of car: "+num);

}
	}

