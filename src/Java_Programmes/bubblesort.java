package Java_Programmes;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
		int a[] = { 10, 5, 22, 6, 8, 3, 11, 5 };
		int n = a.length - 1;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if (a[j] > a[j + 1]) 
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		// System.out.println(Arrays.toString(a));
	}

}
