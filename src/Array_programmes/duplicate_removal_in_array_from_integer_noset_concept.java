package Array_programmes;

import java.util.Arrays;

public class duplicate_removal_in_array_from_integer_noset_concept 
{
    public static void main(String[] args) 
    {
        int[] a = {3, 4, 4, 5, 5, 5, 6, 7, 9, 9}; // Sorted array with duplicates

        int j = 0; // Pointer for unique elements

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) { // Check if the next element is different
                a[j] = a[i]; 
                j++;
            }
        }
        
        a[j] = a[a.length - 1]; // Add the last unique element
        j++; // Increase count of unique elements

        // Printing the unique elements
        for (int k = 0; k < j; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
