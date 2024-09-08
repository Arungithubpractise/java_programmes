package programmes;

public class check2arraysareequal {

	public static void main(String[] args) 
	{
		int[] a = { 10, 3, 5, 6, 2 };
		int[] b = { 10, 2, 5, 6, 2 };
		
		boolean flag = true;
		
		if( a.length == b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!= b[i])
				{
					flag = false;
					}
			}
			
		}
		
		else
		{
			flag =false;
			
			
		}
		
			if (flag==true)
			{
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");
			}
		}
		
		
}
	

	