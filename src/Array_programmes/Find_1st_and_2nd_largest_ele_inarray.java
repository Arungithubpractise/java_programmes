package Array_programmes;

public class Find_1st_and_2nd_largest_ele_inarray 
  {
    public static void main(String[] args) 
    {
        int a[] = {5, 8, 12, 20, 15, 10};

        int large1 = Integer.MIN_VALUE;
        

        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] > large1) 
            {
                large1 = a[i];   // Update 1st largest
            } 
           
        }
            
        int large2 = Integer.MIN_VALUE;   
        
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] > large2 && a[i] < large1  ) 
            {
                large2 = a[i];   
            } 
                 
        }

        System.out.println("1st Largest: " + large1);
        System.out.println("2nd Largest: " + large2);
    }
}
