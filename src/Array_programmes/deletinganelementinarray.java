package Array_programmes;


import java.util.ArrayList;
import java.util.Arrays;

public class deletinganelementinarray {

    public static void main(String[] args) {
        
        // Input array
        Integer[] arr = {10, 20, 30, 40, 50};
        
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer element : arr) {
        	list.add(element);
        }
        
        // Convert array to ArrayList in a single line
       // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        // Remove the element (e.g., 30)
        list.remove(Integer.valueOf(30));

        // Convert back to array (optional)
       // arr = list.toArray(new Integer[0]);

        // Print updated array
        //System.out.println(Arrays.toString(arr));
        
        System.out.println(list);
    }
}
