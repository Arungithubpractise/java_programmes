package Array_programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicate_removal_in_array_from_integer 
{
	public static void main(String[] args) 
    {
        int[] a = {5, 3, 4, 5, 5, 4, 9, 7, 6, 3};

        Set<Integer> set = new HashSet<>();
        
        for (int num : a) {
            set.add(num);
        }

        
        ArrayList<Integer> intt = new ArrayList<Integer>(set);
        System.out.println(intt);
        
        for(Integer in : intt)
        {
        	System.out.print(in + " ");
        }
//        
//        Integer[] b = set.toArray(new Integer[0]);
//
//        System.out.println(Arrays.toString(b));
    }
}
