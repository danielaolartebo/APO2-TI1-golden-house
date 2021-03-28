package model;

public class RestaurantIngredient {
	
	private String ingredientName;
	private MembersStatus ingredientStatus;
	
	public RestaurantIngredient(String ingredientName) {
		this.ingredientName = ingredientName;	
		this.ingredientStatus=MembersStatus.ACTIVA;
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

}
