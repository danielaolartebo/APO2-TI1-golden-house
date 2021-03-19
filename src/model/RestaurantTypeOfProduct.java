package model;

public class RestaurantTypeOfProduct {
	
	private String typeName;
	private MembersStatus typeOfProductStatus;
	
	public RestaurantTypeOfProduct(String typeName) {
		this.typeName = typeName;	
		this.typeOfProductStatus=MembersStatus.ACTIVE;
	}

	public String getTypeOfProductName() {
		return typeName;
	}
	
	public void setTypeOfProductName(String typeName) {
		this.typeName=typeName;
	}
	
	public String toString() {
		return typeName;
	}
	
	public MembersStatus getTypeOfProductStatus() {
		return typeOfProductStatus;
	}

	public void setTypeOfProductStatus(MembersStatus typeOfProductStatus) {
		this.typeOfProductStatus = typeOfProductStatus;
	}

}
