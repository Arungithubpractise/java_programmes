package programmes;

public class times10repeatedinarray {

	public static void main(String[] args) 
	{
		int [] arr = {10,5,6,10,9};
		 
		int count = 0;
		int find = 10;
		for(int i=0; i<arr.length; i++)
		{
			if(find==arr[i])
				
			{
				count++;
				
			}
			
		}
		System.out.println(count);
		 
       }
	}
	


