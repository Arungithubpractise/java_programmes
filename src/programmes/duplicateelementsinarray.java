package programmes;

public class duplicateelementsinarray 
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

/*
int [] a = {2,5,8,2,8};
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
*/


