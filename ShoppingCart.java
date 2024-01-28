
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<ItemOrder> orders;
	private boolean discount;
	
	//Constructor that creates an empty list of item orders
	 public ShoppingCart() {
	        orders = new ArrayList<>();
	        discount = false; 
	    }
	 /* Adds an item order to the list, replacing any previous order for this item
     with the new order. The parameter will be of type ItemOrder. */
	    public void add(ItemOrder itemOrder) {
	      
	        for (int i = 0; i < orders.size(); i++) {
	            // checks the item at i, while using the getItem method to get the 
	        	// item at i and checks if it exist in the existing list.
	        	if (orders.get(i).getItem().equals(itemOrder.getItem())) {
	                orders.set(i, itemOrder);
	                return;
	            }
	        }
	        orders.add(itemOrder);
	    }
	 /* Sets whether or not this order gets a discount (true means there is a
	   	discount, false means no discount). */
	    public void setDiscount(boolean value) {
	        discount = value;
	    }

	
	 // Returns the total cost of the shopping cart
	    public double getTotal() {
	        double total = 0.0;
	        for (ItemOrder itemOrder : orders) {
	            total += itemOrder.getPrice();
	        }
	       // if the discount is true, discount is applied
	        if (discount) {
	            total *= 0.9; 
	        }
	        return total;
	    }
	

}
