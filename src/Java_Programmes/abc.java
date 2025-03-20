package Java_Programmes;

public class abc {

	public static void main(String[] args) 
	
	{
		String Input =  "I Love Dogs";
	       
	       String st[] = Input.split(" ");
	       String srt = "";
	       
	       for(String s : st)
	       {
	           String stri = "";
	           
	           for(int i=0; i<s.length(); i++)
	           {
	             stri   = stri + s.charAt(i);
	           }

	           srt = srt+stri+ " ";
	}
	       
	       System.out.println(srt);

}
}