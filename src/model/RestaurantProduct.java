package model;

public class RestaurantProduct {
	
	// PRODUCTO TIENE NOMBRE, TIPO, INGREDIENTES, TAMAÑO, PRECIO Y ESTADO.

	private String name;
	private String typeOfProduct;
	private String sizeOfProduct;
	private String priceOfProduct;
	private String ingredientsOfProduct;
	private MembersStatus productStatus;
	
	public RestaurantProduct(String name, String typeOfProduct, String ingredientsOfProduct, String sizeOfProduct, String priceOfProduct) {
		this.name = name;
		this.typeOfProduct=typeOfProduct;
		this.ingredientsOfProduct=ingredientsOfProduct;
		this.sizeOfProduct=sizeOfProduct;
		this.priceOfProduct=priceOfProduct;
		this.productStatus=MembersStatus.ACTIVE;
	}

	public String getProductName() {
		return name;
	}
	
	public void setProductName(String name) {
		this.name=name;
	}
	
	public String getTypeOfProduct() {
		return typeOfProduct;
	}
	
	public void setTypeOfProduct(String typeOfProduct) {
		this.typeOfProduct=typeOfProduct;
	}
	
	public String getSizeOfProduct() {
		return sizeOfProduct;
	}
	
	public void setSizeOfProduct(String sizeOfProduct) {
		this.sizeOfProduct=sizeOfProduct;
	}
	
	
	public String getPriceOfProduct() {
		return priceOfProduct;
	}
	
	public void setPriceOfProduct(String priceOfProduct) {
		this.priceOfProduct=priceOfProduct;
	}
	
	public String getIngredientsOfProduct() {
		return ingredientsOfProduct;
	}
	
	public void setIngredientsOfProduct(String ingredientsOfProduct) {
		this.ingredientsOfProduct=ingredientsOfProduct;
	}
	

	public MembersStatus getProductStatus() {
		return productStatus;
	}
	
	public void setProductStatus(MembersStatus productStatus) {
		this.productStatus=productStatus;
	}
	
	public String toString() {
		return name;
	}
}
