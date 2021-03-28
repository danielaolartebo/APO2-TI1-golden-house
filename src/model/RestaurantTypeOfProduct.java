package model;

import java.io.Serializable;
public class RestaurantTypeOfProduct implements Comparable<RestaurantTypeOfProduct>, Serializable {
	





	private static final long serialVersionUID = 1;

	private String typeName;
	private MembersStatus typeOfProductStatus;
	private char nameType;
	
	public RestaurantTypeOfProduct(String typeName) {
		this.typeName = typeName;	
		this.typeOfProductStatus=MembersStatus.ACTIVA;
		this.nameType=getTypeOfProductName().charAt(0);
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


	public String[] getTypeOfProductNameArray() {
		
		return null;
	}
	
	public char getNameType() {
		return nameType;
	}

	@Override
	public int compareTo(RestaurantTypeOfProduct o) {
		if(nameType==o.getNameType()) {
		return 0;
		}else if(nameType>o.getNameType()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
	
}	



