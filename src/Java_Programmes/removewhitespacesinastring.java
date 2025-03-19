package Java_Programmes;

public class removewhitespacesinastring {

	public static void main(String[] args) {
		String str = "wecome to java";
	     String rep = str.replaceAll("\\s","");
       System.out.println(rep);
	}

}
