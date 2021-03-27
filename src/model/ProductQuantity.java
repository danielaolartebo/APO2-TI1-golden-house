package model;

public class ProductQuantity {
	
	private RestaurantProduct p;
	private String nameProduct;
	private double quantity;
	private RestaurantProduct pr;
	private double price;
	
	public ProductQuantity(RestaurantProduct p, double quantity, RestaurantProduct pr) {
		
		nameProduct=p.getName();
		this.quantity=quantity;
		price=pr.getPriceOfProduct();
		
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public RestaurantProduct getPr() {
		return pr;
	}

	public void setPr(RestaurantProduct pr) {
		this.pr = pr;
	}
	
	
	
	
}
