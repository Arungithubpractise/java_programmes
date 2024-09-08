package programmes;

public class sumofsquareofeachdigit {

	public static void main(String[] args) {
		
		int no = 123;
		int sum = 0;
		while(no!=0)
		{
			int a = no%10;
			sum = sum+(a*a);
			no=no/10;
		}
		System.out.println(sum);
	}

}
