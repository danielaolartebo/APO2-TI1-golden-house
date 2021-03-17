package model;

public class RestaurantTypeOfProduct {
	
	private String typeName;
	
	public RestaurantTypeOfProduct(String typeName) {
		this.typeName = typeName;	
	}

	public String getTypeOfProductName() {
		return typeName;
	}
	
	public void setTypeOfProductName(String typeName) {
		this.typeName=typeName;
	}
	
	public String toString() {
		return typeName;
	}

}
