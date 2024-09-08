package programmes;

public class Armstrongnumber {

	public static void main(String[] args) {
		int no = 370;
		int sum = 0;
		int arm = no;
		while(no!=0)
		{
		int a = no%10;
		sum = sum+(a*a*a);
		no =no/10;
	}
		if(arm == sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

	}

}

/*public class Armstrongnumber {

	public static void mian(String args[])

	{
StringBuilder sb = new StringBuilder("Hello");
sb.append("world");

System.out.println(sb);


}*/

		
	

		
	
		