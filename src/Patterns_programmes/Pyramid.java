package Patterns_programmes;

public class Pyramid{

	public static void main(String[] args) 
	{

        int n = 2; // Number of rows

        for (int i = 0; i <= n; i++) 
        {
            // Print leading spaces
            for (int j = 0; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k <= (2 * i); k++) 
            {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
		        }
		    }
		


	}

//int n = 5; // Number of rows
//
//for (int i = 1; i <= n; i++) 
//{
//    // Print leading spaces
//    for (int j = 1; j <= n - i; j++) {
//        System.out.print(" ");
//    }
//    // Print stars
//    for (int k = 1; k <= (2 * i - 1); k++) 
//    {
//        System.out.print("*");
//    }
//    System.out.println(); // Move to the next line
