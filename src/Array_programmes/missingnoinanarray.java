package Array_programmes;

public class missingnoinanarray {

	public static void main(String[] args) {
	int[] a = {1,2,3,5,8};
	int sum1 = 0;
	int sum2 = 0;
	for(int i=0;i<a.length-1;i++ )
	{
		sum1 = sum1+a[i];
	}
  for(int i=1; i<=5; i++)
  {
	  sum2 = sum2+i;
  }
  System.out.println(sum2-sum1);
	}

}






















































