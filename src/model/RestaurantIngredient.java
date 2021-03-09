package model;

public class RestaurantIngredient {
	
	private String ingredientName;
	
	public RestaurantIngredient(String ingredientName) {
		this.ingredientName = ingredientName;	
	}

	public String getIngredientName() {
		return ingredientName;
	}
	
	public void setIngredientName(String ingredientName) {
		this.ingredientName=ingredientName;
	}

}
