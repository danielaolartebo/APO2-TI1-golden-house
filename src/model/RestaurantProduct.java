package model;

public class RestaurantProduct {
	private String productName;
	private int[][] sizePrice;
	
	public RestaurantProduct(String productName, int[][] sizePrice) {
		this.productName = productName;	
		this.sizePrice = sizePrice;
	}

	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	public int[][] getSizePrice() {
		return sizePrice;
	}
	
	public void setProductName(int[][] sizePrice) {
		this.sizePrice=sizePrice;
	}
}
