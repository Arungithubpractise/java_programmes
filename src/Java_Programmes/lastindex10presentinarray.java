package Java_Programmes;

public class lastindex10presentinarray {

	public static void main(String[] args) {
	int [] arr = {10,20,30,10,20};
	int find = 10;
	
	
	{
		for(int i=arr.length-1; i>=0; i--)
		{
			if(find==arr[i])
			{
				
				System.out.println(i);
			}
			
		}
		
	}

	}

}
