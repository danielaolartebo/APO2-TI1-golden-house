package model;

public class TypeOfProduct {
	
	private String name;

	public TypeOfProduct(String typeName) {
		setNameString(typeName);
	}

	public String getNameString() {
		return name;
	}

	public void setNameString(String nameString) {
		this.name = nameString;
	}

}
