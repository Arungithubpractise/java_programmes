package Strings_programmes;

public class reverseastring {
	public static void main(String[] args) {

		String str = "mom";
		String REV = "";

		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			REV = REV + str.charAt(i);

		}
		System.out.println(REV);

		if (REV.equals(str)) {
			System.out.println("palindrome String");
		} else {
			System.out.println("not palindrome String");
		}
	}
}
