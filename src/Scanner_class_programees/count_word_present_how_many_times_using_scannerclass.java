package Scanner_class_programees;

import java.util.Scanner;

public class count_word_present_how_many_times_using_scannerclass {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        int count = 0;
        
     System.out.println("enter word to find how many times word is present in a sentance");
   
         String str = scan.next() ;
         
         scan.nextLine();
        
       System.out.println("enter sentance");

         String str1 = scan.nextLine();
       

       String s[] = str1.split(" ");

       for(String st : s )
       {
        if(st.equals(str))
        {
            count++;
        }

       
       }
       System.out.println(count);

    }
}

	


