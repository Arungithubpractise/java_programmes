package collection_program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Set {
	
//Treeset --> no duplicate, sorting,  no null values
//Hashset --> no duplicate, no sorting,  allows one null value
//Linked Hashset --> no duplicate, no sorting,  allows one null value, order of insertion is preserved
	
	public static void main(String[] args) 
	{
		//TreeSet<String> cars = new TreeSet<String>();  
		//HashSet<String> cars = new HashSet<String>();
		 
		LinkedHashSet<String> cars = new LinkedHashSet<String>();
		  
		 
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Mazda");
		    cars.add(null);
		    cars.add(null);
		   
		   cars.remove("Mazda");
		    
		   cars.remove(4);
		    
		   System.out.println(cars);
		    
		    for (String i : cars) {
			      System.out.println(i);

		}

	}

}
