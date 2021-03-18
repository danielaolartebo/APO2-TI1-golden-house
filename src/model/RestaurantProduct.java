package model;

public class RestaurantProduct {
	private String productName;
	private double[][] sizePrice;
	
	public RestaurantProduct(String productName, double[][] sizePrice) {
		this.productName = productName;	
		this.sizePrice = sizePrice;
	}

	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	public double[][] getSizePrice() {
		return sizePrice;
	}
	
	public void setProductName(double[][] sizePrice) {
		this.sizePrice=sizePrice;
	}
	
	public String toString() {
		return productName;
	}
}
