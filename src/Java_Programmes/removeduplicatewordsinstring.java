package Java_Programmes;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicatewordsinstring {

	public static void main(String[] args) {

String str = "color";

Set<Character> set = new LinkedHashSet<Character>();

 for(int i =0; i<str.length(); i++)
 {
	 set.add(str.charAt(i));
 }
 
StringBuffer sb = new StringBuffer();

for(Character c : set)
{
	sb.append(c);
}
System.out.println(sb);

	}

}
