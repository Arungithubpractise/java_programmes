package collection_program;

import java.util.HashMap;
import java.util.Map;

public class maps {

	public static void main(String[] args)
	{
	
		
	//Duplicate Keys ❌	                Not Allowed
	//Duplicate Values ✅	            Allowed
	//only one null key allowed 	    multiple null values allowed
		
		Map<Integer,String> map=new HashMap<Integer,String>();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    
	 // map.remove(1);
	    map.remove("jai");
	    
	    for(Map.Entry m :  map.entrySet())
	    {
	    	 System.out.println(m.getKey()+ " " +m.getValue());
	    }
	   
	    System.out.println(map);
	    

	}

} 
