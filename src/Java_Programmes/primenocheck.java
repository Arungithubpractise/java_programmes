package Java_Programmes;

public class primenocheck {
	public static void main(String[] args) {
		boolean flag = true;

		int no = 4;

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}