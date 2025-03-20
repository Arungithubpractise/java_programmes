package Patterns_programmes;

public class Mirrorred_Right_angle_triangle {

	public static void main(String[] args) 
	{
		
		  int n = 6; // Number of rows

	        for (int i = 1; i <n; i++) {
	            // Print spaces
	            for (int j = 1; j < n -i ; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println(); // Move to the next line
		        }
	        
	        
	        
	        
		    }
		

		}

	