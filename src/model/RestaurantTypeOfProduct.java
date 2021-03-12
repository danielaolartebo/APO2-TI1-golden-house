package model;

public class RestaurantTypeOfProduct {
	
	private String productName;
	
	public RestaurantTypeOfProduct(String productName) {
		this.productName = productName;	
	}

	public String getIngredientName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}

}
