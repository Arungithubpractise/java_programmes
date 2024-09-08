package programmes;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap {
	
	public static void main(String args[])
	{
	
	/*HashMap<Integer, String> map = new HashMap<Integer, String>();
	 
	map.put(1,"Arun");
	
	System.out.println(map);*/
		
		HashMap map = new HashMap();
		map.put(1, "arun");
		map.put(2, "cat");
		map.put(1, "abc");
		map.put(3, "arun");
		
		//System.out.println(map);
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(1);
		list.add('a');
		list.add("Arun");
	
	   list.remove(0);
	System.out.println(list);
		

		
	}

}
