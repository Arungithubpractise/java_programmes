package programmes;

public class CountNumberOfDigits {

	public static void main(String[] args)
	{
		int no = 123456;
		int count = 0;
		while(no!=0)
		{
			no = no/10;   //123456/10=12345  
			count++;                      
			
		}
        System.out.println(count);
	}

}
