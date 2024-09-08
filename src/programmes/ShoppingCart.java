 package programmes;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	

	 public static void main(String[] args) 
	    {
		   List<product> basket = new ArrayList<>();
		   
		   product a=new product("Leather wallet", 1100, 18, 1);
	        basket.add(a);
	        
	        product b = new product("Umbrella", 900, 12, 2);
	        basket.add(b);
	        
	        
	        basket.add(new product("Cigarette", 200, 28, 3));
	        
	        basket.add(new product("Honey", 100, 0, 4));
		 
		 

	        double totalAmount = 0;
	        double maximumGst = 0;
	        product maximumGstProd = null ;

	        for (product product : basket) 
	        {
	            double totalPrice = product.calculateTotalPrice();
	            totalAmount += totalPrice;

	            if (product.gst > maximumGst)
	            {
	                maximumGst = product.gst;
	                maximumGstProd = product;
	            }
	        }
	        System.out.println("Total amount to be paid to the shopkeeper: Rs. " + totalAmount);
	        System.out.println("Product with maximum GST: " + maximumGstProd.name + " (GST: " + maximumGst +"%)");
	    }
	}

