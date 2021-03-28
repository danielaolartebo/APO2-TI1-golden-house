package model;

public class RestaurantIngredient {
	
	private String ingredientName;
	private MembersStatus ingredientStatus;
	private char nameIngredient;
	
	public RestaurantIngredient(String ingredientName) {
		this.ingredientName = ingredientName;	
		this.ingredientStatus=MembersStatus.ACTIVA;
		nameIngredient=getIngredientName().charAt(0);
	}

	public String getIngredientName() {
		return ingredientName;
	}
	
	public void setIngredientName(String ingredientName) {
		this.ingredientName=ingredientName;
	}
	
	public String toString() {
		return ingredientName;
	}

	public MembersStatus getIngredientStatus() {
		return ingredientStatus;
	}
	
	public void setIngredientStatus(MembersStatus ingredientStatus) {
		this.ingredientStatus=ingredientStatus;
	}

	public char getNameIngredient() {
		return nameIngredient;
	}

	public void setNameIngredient(char nameIngredient) {
		this.nameIngredient = nameIngredient;
	}
	
}
