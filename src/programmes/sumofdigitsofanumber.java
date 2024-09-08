package programmes;

public class sumofdigitsofanumber {

	public static void main(String[] args) {
		int no=555;
		int sum = 0;
		while (no!=0)
		{
			int a = no%10;
			sum = sum+a;
			no = no/10;
		}
		System.out.println(sum);

	}

}
