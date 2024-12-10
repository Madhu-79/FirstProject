package project;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(FileInputStream fileIn=new FileInputStream("info.ser");
		ObjectInputStream in=new ObjectInputStream(fileIn) {
		Info info=(Info)in.readObject();	
		
		System.out.println("Object deserialized from info.ser");
	
		}
	}

}
