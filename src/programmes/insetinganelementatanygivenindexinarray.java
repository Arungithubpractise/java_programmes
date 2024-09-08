package programmes;

public class insetinganelementatanygivenindexinarray
{

	public static void main(String args[])
	{
		int [] arr = {1,2,3,8,6};
		int index = 3;
		int value = 9;
		
		 // Creating new array with increased size
        int new_array[] = new int[arr.length + 1];
 
        // Copying elements from one array to another
        for (int i = 0; i < arr.length; i++) {
            new_array[i] = arr[i];
        }
        
		
		for(int i=new_array.length-1; i>index-1; i--)
		{
			new_array[i] = new_array[i-1];
		}
		new_array[index] = value;
		
		for(int i=0; i<new_array.length; i++)
		{
			System.out.println(new_array[i]);
		}
	}
	
}

