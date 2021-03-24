package model;

public class ProductQuantity {
	
	private double quantity;
	private String nameProduct;
	
	public ProductQuantity(String nameProduct, double quantity) {
		this.nameProduct=nameProduct;
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
	
	
}
