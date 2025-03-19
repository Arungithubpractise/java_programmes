package Java_Programmes;

public class fibonancialserieslesshundred 
{
	public static void main(String[] args)
	{
		int fibo1 = 0;
		int fibo2 = 1;
		int fibo3;
		for(int i=2; i<=20; i++)
		{
			fibo3 = fibo1+fibo2;
			System.out.println(fibo3);
			fibo1=fibo2;
			fibo2=fibo3;
		}
		
		
		
	}

}



