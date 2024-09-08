package collection_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) 
	{
		// LinkedList<String> cars = new LinkedList<String>();
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add(null);
		    cars.add(null);
		    
		    cars.add(1, "ABC");
		    cars.set(2, "BCD");
		    cars.remove(4);
		    
		    
		    //Collections.sort(cars);
		    
		    System.out.println(cars);

		    for (String i : cars) {
		      System.out.println(i);

	}

}
}
