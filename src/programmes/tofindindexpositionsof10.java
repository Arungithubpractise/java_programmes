package programmes;

public class tofindindexpositionsof10 
     {

	public static void main(String[] args) 
	{
		int [] arr = {10,5,4,10,10};
		int find = 10;
		for(int i =0; i<=arr.length-1; i++)
{
	if(find == arr[i])
	{
		System.out.println(i);
	}
}
}
}
