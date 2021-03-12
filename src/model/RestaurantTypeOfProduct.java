package model;

public class RestaurantTypeOfProduct {
	
	private String typeName;
	
	public RestaurantTypeOfProduct(String typeName) {
		this.typeName = typeName;	
	}

	public String getTypeOfProduct() {
		return typeName;
	}
	
	public void setTypeOfProduct(String typeName) {
		this.typeName=typeName;
	}

}
