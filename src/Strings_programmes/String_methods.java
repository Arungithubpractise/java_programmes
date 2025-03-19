package Strings_programmes;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_methods {

	public static void main(String Array[]) {
		
		//System.out.println(add());
		
		String str = "my name IS Arun";
		
		//if the string is in uppercase or lowerase if string it gives output as true if a sentence is correct
		System.out.println(str.equalsIgnoreCase("my name is arun"));   		 	
		System.out.println(str.contains("m"));
		System.out.println(str.startsWith("m"));
		System.out.println(str.startsWith("y"));
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	    System.out.println(str.substring(11));
		System.out.println(str.substring(11, 15));
			
	}
}
		//StringBuffer sb = new StringBuffer("my name Arunkumar");
		
		//System.out.println(sb.reverse());
		 
		/*String st = "arun";
		//st.concat("n");
		st=st.concat(" n");
		String str = "kumar";
		
		System.out.println(st.concat(str));
		}

	}


 /*String str = "my name is is arun";
  
  String st [] = str.split(" ");
 
  Set set = new LinkedHashSet();
 
  for(String s : st )  
	  
	  set.add(s); 
  
  Iterator s = set.iterator();
  
 while(s.hasNext()) 
 
 { System.out.print(s.next()+ " "); }
 
 }
 
  }*/


/*
 * public static void main(String Array[])
 * 
 * {
 * 
 * ArrayList<Object> lis = new ArrayList<Object>(); lis.add("abc"); lis.add(5);
 * lis.add('a'); lis.add(true);
 * 
 * Object k[] = lis.toArray();
 * 
 * 
 * for(Object j : k) { System.out.println(j); }
 * 
 * }
 * 
 * 
 * }
 * 
 * // Main driver method /* public static void main(String[] args) {
 * 
 * // Creating an empty ArrayList of string type ArrayList<String> al = new
 * ArrayList<String>();
 * 
 * // Populating the ArrayList by custom elements al.add("Anshul Aggarwal");
 * al.add("Mayank Solanki"); al.add("Abhishek Kelenia"); al.add("Vivek Gupta");
 * 
 * Object[] k = al.toArray();
 * 
 * // Printing using for each loop for (Object o : k) { System.out.println(o); }
 * } }
 * 
 * /*public static void main(String[] args) {
 * 
 * // Creating an empty ArrayList of string type ArrayList<String> al = new
 * ArrayList<String>();
 * 
 * // Populating the ArrayList by custom elements al.add("Anshul Aggarwal");
 * al.add("Mayank Solanki"); al.add("Abhishek Kelenia"); al.add("Vivek Gupta");
 * 
 * // Converting above List to array using toArray() // method and storing it in
 * an string array Object[] k = al.toArray();
 * 
 * // Iterating over above string array for (Object str : k) {
 * 
 * // Printing the elements in above array System.out.println(str); } } }
 * //Object ob[] =
 * 
 * /*Object ob [] = {'a','b','f','r',5,'c','f','g'} ;
 * 
 * 
 * for(Object i: ob) {
 * 
 * { System.out.print(i+ " ");
 * 
 * } System.out.println();
 * 
 * } }
 * 
 * 
 * 
 * 
 * 
 * /*
 * 
 * int a[][] = new int[3][5];
 * 
 * a[0][0]=1; a[0][1]=2; a[0][3]=3;
 * 
 * a[1][0]=1; a[1][1]=2; a[1][3]=3;
 * 
 * a[2][0]=1; a[2][1]=2; a[2][3]=3;
 * 
 * for(int i[]:a ) { for(int j:i) { System.out.print(j); } System.out.println();
 * }
 * 
 * 
 * 
 * 
 * for(int i[]:a) { for(int j:i) { System.out.print(j+ " "); }
 * System.out.println(); }
 * 
 * /*for(int i=0; i<=2; i++) { for(int j=0; j<=4; j++) {
 * System.out.print(a[i][j]+ " "); } System.out.println(); }
 * 
 * /* for(int i[]:a) { for (int j : i) { System.out.print(j+ " "); }
 * System.out.println(); }
 */
