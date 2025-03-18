package Java_Programmes;

public class removespecialcharoorjunk {

	public static void main(String[] args)
	{
		String str = "!@#$ *()(*&&^&&** welcome to java 012356999";
		String a = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(a );
	}

}
