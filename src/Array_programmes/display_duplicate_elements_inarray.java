package Array_programmes;

public class display_duplicate_elements_inarray 
{

	public static void main(String[] args)
	{
		String [] a = {"abc","de","abc","de","def"};
		boolean flag = false;
	  
		for(int i = 0; i<a.length; i++ )
			{
			
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]);
					flag=true;
				}
			}

	}
		if(flag==false)
		{
			System.out.println("duplicate string not found");
		}
	}
	}


