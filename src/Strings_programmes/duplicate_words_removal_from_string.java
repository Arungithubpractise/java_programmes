package Strings_programmes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicate_words_removal_from_string {

	public static void main(String[] args) {

		String str = "my name name is is Arun";

		String st[] = str.split("\\s+ ");

		Set<String> set = new LinkedHashSet<String>();

		for (String s : st) {
			set.add(s);
		}

		System.out.println(set);

//		 Iterator<String> itr = set.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+" ");
//		}
//		
		ArrayList<String> list = new ArrayList<String>(set);

		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}

		System.out.print(list);

	}

}
