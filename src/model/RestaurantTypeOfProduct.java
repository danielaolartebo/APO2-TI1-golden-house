package model;

import java.io.Serializable;

public class RestaurantTypeOfProduct implements Serializable{

	private static final long serialVersionUID = 1;
	private String typeName;
	private MembersStatus typeOfProductStatus;
	
	public RestaurantTypeOfProduct(String typeName) {
		this.typeName = typeName;	
		this.typeOfProductStatus=MembersStatus.ACTIVA;
	}

	public String getTypeOfProductName() {
		return typeName;
	}
	
	public void setTypeOfProductName(String typeName) {
		this.typeName=typeName;
	}
	
	public MembersStatus getTypeOfProductStatus() {
		return typeOfProductStatus;
	}

	public void setTypeOfProductStatus(MembersStatus typeOfProductStatus) {
		this.typeOfProductStatus = typeOfProductStatus;
	}

}
