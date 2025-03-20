package Java_Programmes;

public class string {

	public static void main(String[] args)
	
	{
	    String str = "Hi Hello";
	    String [] split =  str.split(" ");
	    
	    String revword = "";
	    
	    for(String st : split)
	    {
	        String rev = "";
	        for(int i=st.length()-1; i>=0; i--)
	        {
	            rev = rev+st.charAt(i);
	        }
	        System.out.print(rev+" ");
	    }
	   // revword = revword+rev;
	    
	    }
	    
	

	}


