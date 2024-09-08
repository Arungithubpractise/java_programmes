package collection_program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) 
	{
		// TreeSet<String> cars = new TreeSet<String>();
		// HashSet<String> cars = new HashSet<String>();
		 
		 LinkedHashSet<String> cars = new LinkedHashSet<String>();
		  
		 
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Mazda");
		 // cars.add(null);
		   //cars.add(null);
		   
		   cars.remove("Mazda");
		    
		   System.out.println(cars);
		    
		    for (String i : cars) {
			      System.out.println(i);

		}

	}

}
