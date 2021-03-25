package model;

public class ProductQuantity {
	
	private RestaurantProduct p;
	private String nameProduct;
	private double quantity;
	
	public ProductQuantity(RestaurantProduct p, double quantity) {
		
		nameProduct=p.getName();
		this.quantity=quantity;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}


	public RestaurantProduct getP() {
		return p;
	}

	public void setP(RestaurantProduct p) {
		this.p = p;
	}
	
	
}
