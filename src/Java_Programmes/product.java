package Java_Programmes;

public class product {
	    String name;
	    double unitPrice;
	    double gst;
	    int quantity;

	    public product(String name, double unitPrice, double gst, int quantity) 
	    {
	        this.name = name;
	        this.unitPrice = unitPrice;
	        this.gst = gst;
	        this.quantity = quantity;
	    }

	    double calculateTotalPrice() 
	    {
	        double totalPrice = unitPrice * quantity;
	        
	        if (unitPrice >= 500)
	        {
	            totalPrice -= totalPrice * 0.05; // Apply 5% discount for unit price >= 500
	        }
	        totalPrice += totalPrice * gst / 100; // Add GST amount
	        
	        return totalPrice;
	    }
	}



