package Java_Programmes;

public class reverseano {

	public static void main(String[] args) 
	{
		int no = 12323;
		
		int rev = 0;
		 
		while(no!=0)             // 0=0 condition satisfies and loop exists when no = 0/10 = 0
		{
			rev = rev*10 + no%10;  //4  //40+6=46 //460+3=463 //4630+2=4632  // 46320+1=46321         
			no = no/10;            //1236 //123 //12 //1 //0
		}
          System.out.println(rev);
	}

}
