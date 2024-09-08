package programmes;

public class reverseallwordsinsentence {

	public static void main(String[] args) 
	{
		
	
	String  str = "Welcome To Java";
	String [] arr = str.split(" ");
	String reverseword = "";
   
	for(String word:arr)
	{
		String rev ="";
		int a = word.length()-1;
		for(int i = a; i>=0; i-- )
		{
			   rev = rev+word.charAt(i);
		}
		reverseword = reverseword+" "+rev;
	}
	System.out.println(reverseword);
	}

}
