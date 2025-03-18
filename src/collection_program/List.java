package collection_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) 
	{
		////duplicates are allowed, follows order of insertion
		
		
		LinkedList<String> cars = new LinkedList<String>();
	 //ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Maruthi");
		    cars.add("Maruthi");
		    cars.add("Maruthi"); //duplicates are allowed 
		    
		    
		    cars.add(null);
		    cars.add(null);
		    
		    cars.add(1, "ABC");
		    cars.set(5, "BCD");
		    
		    cars.remove(4);
		    //cars.remove("BMW");
		    
		    //Collections.sort(cars);
		    
		    System.out.println(cars);

		    for (String i : cars) {
		      System.out.println(i);

	}

}
}
