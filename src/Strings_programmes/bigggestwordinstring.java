package Strings_programmes;

public class bigggestwordinstring {

	public static void main(String[] args)
	{
		String str = "welcome to java";
		String[] word = str.split(" ");
		String letters = "";
		int count = 0;
		for(String var : word)
		{
			if(var.length()>count) 
			{
				count = var.length();
				letters=var;
			}
		}
		
System.out.println(count);
System.out.println(letters);
	}
	

}
 


