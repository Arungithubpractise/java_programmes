package Strings_programmes;

public class Converting_all_1stletters_to_capital_letter1 {

	public static void main(String[] args) {
	
		 String input = "hello world from a java";	
		        
		        if (input == null || input.isEmpty()) 
		        {
		            System.out.println("Input string is empty.");
		            return;                                                 //exit main method stops further execution
		        }
		        
		        String[] str = input.split("\\s+");
		    		        
		        for (int i = 0; i < str.length; i++)
		        {
		            if (str[i].length() > 0) 
		            {
		            	str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1).toLowerCase();
		            }
		        }
		     
//		    String  joinword =  String.join(" ", words);
//		    
//		        System.out.println(joinword);
//		    }
	
	  for (String word : str) {
          System.out.print(word + " ");

	}

	}
}
