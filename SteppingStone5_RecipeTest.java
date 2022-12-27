package SteppingStones;

import java.util.ArrayList;
// import SteppingStones.SteppingStone5_Recipe;
// import SteppingStones.Ingredient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SteppingStone5_RecipeTest {

	/**
 	* @param args the command line arguments
 	*/
	
	public static void main(String[] args) {
		// Create two recipe objects first
		SteppingStone5_Recipe myFirstRecipe = new SteppingStone5_Recipe();
		final ArrayList<Ingredient> recipeIngredients = new ArrayList<>(); 
		ArrayList<Ingredient> recipeIngredientsTwo = new ArrayList<>(); 
		String ingredientName = "Anchovies";
		// String tempIngredient = new tempIngredient().addNewIngredient(ingredientName);
		recipeIngredients.add(ingredientName);
      
    	SteppingStone5_Recipe mySecondRecipe = new SteppingStone5_Recipe("Pizza", 2, recipeIngredients, 300);
   	 
    	// Initialize first recipe
		String ingredientNameTwo = "Noodles";
		// String tempIngredientTwo = new tempIngredient().addNewIngredient(ingredientNameTwo);
		recipeIngredientsTwo.add(ingredientName);

    	myFirstRecipe.setRecipeName("Ramen");
    	myFirstRecipe.setServings(2);
    	myFirstRecipe.setRecipeIngredients(recipeIngredientsTwo);
    	// myFirstRecipe.totalRecipeCalories(150);
   	 
    	// Print details of both recipes
    	myFirstRecipe.printRecipe();
    	mySecondRecipe.printRecipe();
	}
    
}
