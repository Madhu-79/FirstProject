package project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 class Info implements Serializable{
	String name;
	int age;
	
	Info(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Info info=new Info("madhu",20);
try(FileOutputStream fileOut=new FileOutputStream("info.ser");
		ObjectOutputStream out=new ObjectOutputStream(fileOut)){
	out.writeObject(info);
	System.out.println("Object serialized to info.ser");
}
catch(IOException e) {
	e.printStackTrace();
}
}
	
}
