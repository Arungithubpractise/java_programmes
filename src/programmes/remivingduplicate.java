package programmes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class remivingduplicate {
	
	
	 public static List<Integer> findUniqueElements(int[] nums) {
	        Set<Integer> uniqueSet = new HashSet<>();
	        Set<Integer> duplicateSet = new HashSet<>();

	        for (int num : nums) {
	            if (!duplicateSet.contains(num)) {
	                if (uniqueSet.contains(num)) {
	                    uniqueSet.remove(num);
	                    duplicateSet.add(num);
	                } else {
	                    uniqueSet.add(num);
	                }
	            }
	        }

	        return new ArrayList<>(uniqueSet);
	    }
	 public static void main(String[] args) {
	        int[] nums = {1, 2, 2, 3, 4, 5, 5, 6, 6};
	        List<Integer> uniqueElements = findUniqueElements(nums);
	        System.out.println("Unique elements in the array: " + uniqueElements);
	    }
	
		}

	


