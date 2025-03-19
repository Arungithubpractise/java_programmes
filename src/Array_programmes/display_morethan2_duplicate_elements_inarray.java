package Array_programmes;

import java.util.HashSet;

public class display_morethan2_duplicate_elements_inarray 
{

	public static void main(String[] args)
	{
		String[] str = {"e","e","a", "a", "a", "b", "b", "c", "c"};

        // HashSet to track unique elements
		
       java.util. HashSet<String> uniqueSet = new java.util.HashSet<>();
       
        // HashSet to track duplicates
       
       java.util. HashSet<String> duplicates = new java.util.HashSet<>();

        for (String element : str) 
        {
            // If the element is already in the uniqueSet, add it to duplicates
        	
            if (!uniqueSet.add(element)) 
            {
                duplicates.add(element);
            }
        }

        // Printing the duplicates
        System.out.println("Duplicate elements are: " + duplicates);
	}
	}


