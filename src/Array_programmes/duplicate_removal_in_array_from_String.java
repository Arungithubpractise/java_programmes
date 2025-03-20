package Array_programmes;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicate_removal_in_array_from_String {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "cherry", "banana", "date", "grape", "date"};

        // Using LinkedHashSet to maintain insertion order while removing duplicates
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        // Converting set back to array
        String[] uniqueArr = set.toArray(new String[0]);

        // Printing the unique elements
        System.out.println(Arrays.toString(uniqueArr));
    }
}

