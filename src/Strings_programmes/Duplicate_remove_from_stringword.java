package Strings_programmes;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate_remove_from_stringword {

	public static void main(String[] args) 
	{

		String str = "color";

		Set<Character> set = new LinkedHashSet<Character>();

		 for(int i =0; i<str.length(); i++)
		 {
			 set.add(str.charAt(i));
		 }
		 
		 for(Character c : set)
			{
				System.out.print(c);
			}
		 
		 
//		StringBuffer sb = new StringBuffer();
//
//		for(Character c : set)
//		{
//			sb.append(c);
//		}
//		System.out.println(sb);

			}

		
	

	}


