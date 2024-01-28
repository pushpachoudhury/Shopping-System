
public class Item {
	private String name;
	private double price;
	private int bulkQuantity;
	private double bulkPrice;
	private int quantity;

	//Constructor that takes a name and a price as arguments.
	public Item (String name, double price) {
		 
		 if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative.");
		 }
		 this.name = name;
		 this.price = price;
	}

	/* Constructor that takes a name and a single-item price and a bulk quantity and
	  a bulk price as arguments */
	public Item(String name, double price, int bulkQuantity, double bulkPrice) {
		if (price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
			throw new IllegalArgumentException("Value cannot be negative.");
		}
		this.name = name;
		this.price = price;
		this.bulkQuantity = bulkQuantity;
		this.bulkPrice = bulkPrice;
	}
		
	//Returns the price for a given quantity of the item 
	public double priceFor (int quantity) {
		
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity cannot be nagative.");
		}
		if (bulkQuantity > 0 && quantity >= bulkQuantity) {
            return (quantity / bulkQuantity) * bulkPrice + (quantity % bulkQuantity) * price;
        }
        return quantity * price;
	}

	// Returns a String representation of this item
	public String toString () {
		StringBuilder stringItem = new StringBuilder (name + ", " + price);
		if (bulkQuantity > 0) {
			stringItem.append(" (").append(bulkQuantity).append(" for ").append(bulkPrice).append(")");
		}
		return stringItem.toString();
	}
	
}
