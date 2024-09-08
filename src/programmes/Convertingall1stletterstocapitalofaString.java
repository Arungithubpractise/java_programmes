package programmes;

import java.util.Scanner;

public class Convertingall1stletterstocapitalofaString {

	public static void main(String[] args) {
		           
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the string");
		
		String str = scan.next().replace('A', 'a');
		
		System.out.println(str);*/
		
		for(int i=0; i<1;i++)
		{
		
			String str = "my name is arun";
			String str1 = "my name is arun";
			String st = "Arun";
			
			System.out.println(st.substring(2)); 
			
			
			System.out.println("Converting all 1st letters to capital of a String");
			
			StringBuffer buf = new StringBuffer(str);
			buf.replace(0, 1, "M");
			buf.replace(3, 4, "N");
			buf.replace(8, 9, "I");
			buf.replace(11, 12, "A");
			System.out.println(buf);			
			
			System.out.println("Converting all last letters to capital of a String");
			
			StringBuffer buf1 = new StringBuffer(str1);
			buf1.replace(1, 2, "Y");
			buf1.replace(6, 7, "E");
			buf1.replace(9, 10, "S");
			buf1.replace(14, 15, "N");
			System.out.println(buf1);
			
					
			
		}
	}
		
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

			
		
		

	


