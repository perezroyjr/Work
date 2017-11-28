package Project;

public class Purchase{
	
	
	private Items item;
	private int quantity;
	private double cost;
	private static int numOfPurchases;
	private static int purchaseNum = 0;
	
	
	//Default Constructor
	public Purchase() {
		item = null;
		quantity = 0;
		cost = 0.0;
		numOfPurchases = 0;
		purchaseNum = 0;
	}
	public Purchase(Items item, int quantity) {
		this.item = item;
		this.quantity = quantity;
		this.cost = quantity * item.getPrice();
//		this.numOfPurchases = numOfPurchases;
		this.purchaseNum += 1;
	}
	
	//Getters and Setters
	public String getItem() {
		return item.toString();
	}
	public int getQuantity() {
		return quantity;
	}
	public double getCost() {
		return cost;
	}
	public int getNumOfPurchases() {
		return numOfPurchases;
	}
	public int getPurchaseNum() {
		return purchaseNum;
	}
//	public void setItem(Item item) {
//		this.item = item;
//	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setNumOfPurchases() {
		this.numOfPurchases = numOfPurchases;
	}
	public void setPurchaseNum(int purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	
	//toString
	public String toString() {
		String s = "Item: "+ item + ", Total Cost: $" + cost +", Quantity: " + quantity+
				", Purchase Number: " + purchaseNum;
		return s;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchase other = (Purchase) obj;
		if (Double.doubleToLongBits(cost) != Double
				.doubleToLongBits(other.cost))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (purchaseNum != other.purchaseNum)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
	//equalsMthod
//	public boolean equals(Object o) {
//		if (o instanceof Purchase) {
//			Purchase otherP = (Purchase)o;
//			if(this.item.equalsIgnoreCase(otherP.item)) {
//				if(this.cost == otherP.cost) {
//					if (this.quantity == otherP.quantity) {
//						if (this.numOfPurchases == otherP.numOfPurchases) {
//							if(this.purchaseNum == otherP.purchaseNum) {
//								return true;
//							}
//						}
//					}
//				}
//			}
//		}
//		return false;
//	}
//	
}