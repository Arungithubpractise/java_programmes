package Patterns_programmes;

public class Hill_pattern {

	public static void main(String[] args)
	{
		int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            // Print left stars
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }

            // Print right stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line	

	}

}
}