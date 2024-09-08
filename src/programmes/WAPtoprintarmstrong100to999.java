package programmes;

public class WAPtoprintarmstrong100to999 {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=100; i<=999; i++)
		{
		
			int no = i;
			int sum = 0;
			int copy = no;
			while(no!=0)
			{
			int a = no%10;
			sum= sum+(a*a*a);
				no=no/10;
			}
		
		if(sum==copy)
		{
			count++;
		}
		
		
	}
		System.out.println(count);	
}
}
