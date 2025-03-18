package Java_Programmes;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class practise {

	public static void main(String[] args)
	{
		
		// Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a line of text
        System.out.println("Enter a line of text:");
        
        // Use nextLine() to read the entire line entered by the user
        String input = scanner.nextLine();
        
        // Display the entered text
        System.out.println("You entered: " + input);
        
        // Close the scanner
        scanner.close();
    }
	}
