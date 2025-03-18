package Strings_programmes;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class asada {

	public static void main(String[] args) 
	{
	String st = "this is a is bangalore";
	
	String spl [] = st.split(" ");
	
	for(int i =0 ; i<spl.length; i++)
	{
		if(spl[i].length()>0)
		{
			spl[i] = spl[i].substring(0,1).toUpperCase()+spl[i].substring(1).toLowerCase();
		}
	}
	String sb = st.join(" ", spl);
	System.out.println(sb);
	
	}	
}