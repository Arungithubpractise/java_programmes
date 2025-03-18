package Scanner_class_programees;

import java.util.Scanner;


    //sc.nextLine(); is used to read a complete line (including spaces) as input from the user.

//Method	    Reads	                                Stops at
//next()	    Only one word (no spaces)	            Space or Enter
//nextLine()	The entire line (including spaces)	    Enter

public class scanner_class 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        
        double salary = sc.nextDouble();

        System.out.println("Name: " + name);
        
        System.out.println("Age: " + age);
        
        System.out.println("Salary: " + salary);

        sc.close(); // Closing the scanner
    }
}
