package model;

public class ProductQuantity {
	
	private Order q;
	private RestaurantProduct p;
	private String nameProduct;
	private double quantity;
	
	public ProductQuantity(RestaurantProduct p, Order q) {
		
		nameProduct=p.getName();
		quantity=q.getQuantity();
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

	public Order getQ() {
		return q;
	}

	public void setQ(Order q) {
		this.q = q;
	}

	public RestaurantProduct getP() {
		return p;
	}

	public void setP(RestaurantProduct p) {
		this.p = p;
	}
	
	
}
