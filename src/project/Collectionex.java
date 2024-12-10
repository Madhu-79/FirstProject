package project;
import java.util.*;

public class Collectionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        List<String> list = new ArrayList<>();
		        list.add("Apple");
		        list.add("23d ");
		        list.add("Orange");
		        list.remove(2);

		        Set<String> set = new HashSet<>(list); // Adding list elements to set

		        Map<Integer, String> map = new HashMap<>();
		        map.put(1, "Red");
		        map.put(2, "Green");
		        map.put(3, "Blue");

		        System.out.println("List: " + list);
		        System.out.println("Set: " + set);
		        System.out.println("Map: " + map);
		    }
	
	}
