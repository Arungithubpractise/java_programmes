package programmes;

public class maxandmineleinarray {

	public static void main(String[] args) {
		int []  a = {1000000,50000000,1000,50000};
		int max = a[0];
		
		for(int j=1; j<a.length-1;j++)
			{
				if(a[j]>max)
				{
					max = a[j];
				}
			}
		System.out.println(max);
		}
		
      
	}


