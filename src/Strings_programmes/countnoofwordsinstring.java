package Strings_programmes;

public class countnoofwordsinstring {

	public static void main(String[] args)
	{
		String str = "Welcome to java";
	
		int count = 1;
		
		for(int i=1; i<str.length(); i++) 
		{
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
					
		}
		System.out.println(count);
	
		}
	
	}





