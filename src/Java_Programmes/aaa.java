package Java_Programmes;

public class aaa {

	public static void main(String[] args) 
	{
	    
		       String str="mphasis pvt ltd";
		       
		     
		       
		       StringBuffer buf = new StringBuffer(str);
		       
		       buf.replace(0, 1, "M");
		       buf.replace(8,9,"P");
		       buf.replace(12,13,"L");
		           
		           
		       
		 System.out.println(buf);
		    }
		

	}


