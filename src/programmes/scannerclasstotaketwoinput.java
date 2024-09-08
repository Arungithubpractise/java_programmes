package programmes;

import java.util.Scanner;

public class scannerclasstotaketwoinput {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

//Numbers

/*System.out.println("enter first numbers");
int firstnumber = scan.nextInt();
 
System.out.println("enter second numbers");
int secondnumber = scan.nextInt();

scan.close();

System.out.println("the sum of first number and second number is : " +(firstnumber+secondnumber));*/


//  String 

/*System.out.println("enter ur name");
String st = scan.next();
System.out.println("ur name is : " +st);

System.out.println("enter ur full name");
System.out.println("ur full name is : " +st.concat(scan.next()));*/

//String with mutiple words  (here to read multiple words which have space in between use nextline method

System.out.println("enter ur name");
String st1 = scan.nextLine();
System.out.println("ur name is : " +st1);


	}

}





