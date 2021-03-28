package model;

public class RestaurantIngredient {
	
	private String ingredientName;
	private MembersStatus ingredientStatus;
	private char nameIngredient;
	
	public RestaurantIngredient(String ingredientName) {
		this.ingredientName = ingredientName;	
		this.ingredientStatus=MembersStatus.ACTIVA;
		this.ingredientName = getIngredientName();
	}

	public String getIngredientName() {
		return ingredientName;
	}
	
	public void setIngredientName(String ingredientName) {
		this.ingredientName=ingredientName;
	}

	public MembersStatus getIngredientStatus() {
		return ingredientStatus;
	}
	
	public void setIngredientStatus(MembersStatus ingredientStatus) {
		this.ingredientStatus=ingredientStatus;
	}

	public char getNameIngredient() {
		return ingredientName.charAt(0);
	}

	public void setNameIngredient(char nameIngredient) {
		this.nameIngredient = nameIngredient;
	}
	
}
