package model;

import java.util.ArrayList;
import java.util.List;

public class LaCasaDorada {
	
	private List<RestaurantProduct> products;
	private List<RestaurantIngredient> ingredients;
	
	public LaCasaDorada() {
		products = new ArrayList<>();
		ingredients = new ArrayList<>();
	}
	
	public void addProduct(String productName) {
		products.add(new RestaurantProduct(productName));
	}
	public void addIngredient(String ingredientName) {
		ingredients.add(new RestaurantIngredient (ingredientName));
	}
	
}
