package model;

import java.io.Serializable;

public class RestaurantIngredient implements Serializable{

	private static final long serialVersionUID = 1;
	private String ingredientName;
	private MembersStatus ingredientStatus;
	
	public RestaurantIngredient(String ingredientName) {
		this.ingredientName = ingredientName;	
		this.ingredientStatus=MembersStatus.ACTIVA;
<<<<<<< HEAD
		nameIngredient=getIngredientName().charAt(0);
=======
>>>>>>> 87ff2b26ce2e08886bb54caebd99d9dad2e88a20
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

<<<<<<< HEAD
	public char getNameIngredient() {
		return nameIngredient;
	}

	public void setNameIngredient(char nameIngredient) {
		this.nameIngredient = nameIngredient;
	}
	
=======
>>>>>>> 87ff2b26ce2e08886bb54caebd99d9dad2e88a20
}
