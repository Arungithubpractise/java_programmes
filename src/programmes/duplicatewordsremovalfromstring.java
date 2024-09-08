package programmes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicatewordsremovalfromstring {

	public static void main(String[] args) {
		 
		String str = "my name name is is Arun";
		
		String st [] = str.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(String s : st )
		{
			set.add(s);
		}
		
		 Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		/*ArrayList<String> list = new ArrayList<String>(set);
		
		list.get(0);
		
		System.out.println(list);*/
		

	}

}
