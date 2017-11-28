package Project;

public class Items {
	protected String itemName;
	private double price;
	
	
	//Default Constructor
	public Items() {
		itemName = "Item";
		price = 0.0;
		
	}
	//Overloaded Constructor
	public Items(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	//Getters and Setters
	public String getItemName() {
		return itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//toString
	@Override
	public String toString() {
		String s = itemName + ", Price: $" + price ;
		return s;
	}
	//equals Method
	@Override
	public boolean equals(Object o) {
		if (o instanceof Items) {
			Items otherI = (Items)o;
			if (this.itemName.equalsIgnoreCase(otherI.itemName)) {
				if (this.price == otherI.price) {
					return true;
				}
			}
		} 
		return false;
	}
}



