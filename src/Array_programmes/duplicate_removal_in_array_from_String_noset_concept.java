package Array_programmes;

import java.util.Arrays;

public class duplicate_removal_in_array_from_String_noset_concept {
    public static void main(String[] args) {
        String[] arr = {"apple", "apple", "banana", "banana", "cherry", "date", "date", "grape"}; // Sorted array with duplicates
        
        int j = 0; // Pointer for unique elements
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (!arr[i].equals(arr[i + 1])) { // Compare adjacent elements
                arr[j] = arr[i];
                j++;
            }
        }
        
        arr[j] = arr[arr.length - 1]; // Add last unique element
        j++; // Increase count of unique elements

        // Print unique elements
        for (int k = 0; k < j; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

