package Scanner_class_programees;

import java.util.Scanner;

public class integer {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		//Numbers

		System.out.println("enter first numbers");
		int firstnumber = scan.nextInt();
		 
		System.out.println("enter second numbers");
		int secondnumber = scan.nextInt();

		scan.close();

		System.out.println("the sum of first number and second number is : " +(firstnumber+secondnumber));


	}

}
