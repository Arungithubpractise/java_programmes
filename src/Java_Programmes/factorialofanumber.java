package Java_Programmes;

public class factorialofanumber {

	public static void main(String[] args) {

		int no = 3;
		int fact = 1;

		for (int i = no; i >= 1; i--) 
		{
			fact = fact * i; // 3=1*3;
		}
		System.out.println(fact);

	}

}
