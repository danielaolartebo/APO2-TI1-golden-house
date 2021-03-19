package model;

public class RestaurantProduct {
	
	// PRODUCTO TIENE NOMBRE, TIPO, INGREDIENTES, TAMAÑO, PRECIO Y ESTADO.
	
	private RestaurantIngredient ingredients;
	private RestaurantTypeOfProduct products;
	private String productName;
	private double[][] sizePrice;
	private MembersStatus productStatus;
	
	public RestaurantProduct(String productName, double[][] sizePrice) {
		this.productName = productName;	
		this.sizePrice = sizePrice;
		this.productStatus=MembersStatus.ACTIVE;
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

	public MembersStatus getProductStatus() {
		return productStatus;
	}
	
	public void setProductStatus(MembersStatus productStatus) {
		this.productStatus=productStatus;
	}
}
