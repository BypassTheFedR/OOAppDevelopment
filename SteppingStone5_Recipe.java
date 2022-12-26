package SteppingStones;
 
import java.util.Scanner;
import javax.management.monitor.StringMonitor;
import java.util.ArrayList;

public class SteppingStone5_Recipe {
    
    // initilize variables for recipe name, servings, ingredients, and total recipe calories.
    private String recipeName;
    private int servings = 0;
    // Attempt to use Ingredient class - for final project
    // ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();
    private ArrayList<String> recipeIngredients = new ArrayList<String>();
    private int totalRecipeCalories = 0;

     // Sets the name of the recipe
     public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
     }

     // Gets the recipe name
     public String getRecipeName() {
        return recipeName;
     }
     
     // Sets the number of servings
     public void setServings (int servings) {
        this.servings = servings;
     }

     // Gets the number of servings
     public int getServings () {
        return servings;
     }

     // Sets the recipe ingredients
     public void setRecipeIngredients (ArrayList<String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
     }

     // Gets the recipe ingredients
     public ArrayList<String> getRecipeIngredients () {
        return recipeIngredients;
     }
    
    // SteppingStone5 constructor
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0; //<--- assignment value with appropriate data type
        this.recipeIngredients = new ArrayList<String>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0;    
    }

    // SteppingSTone 5 method
    public SteppingStone5_Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, double totalRecipeCalories) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = (int) totalRecipeCalories;
    }
    
    // Method to print recipe
    public void printRecipe() {
        int singleServingCalories = (totalRecipeCalories / servings);
        System.out.println("Recipe: " + recipeName);
        System.out.println("Serves: " + servings);
        System.out.println("Ingredients: ");

        for (int i = 0; i < recipeIngredients.size(); ++i) {
            String ingredient = recipeIngredients.get(i);
            System.out.println(ingredient);
        }
        System.out.println("Each serving has " + singleServingCalories + " Calories.");
    }
    
     public SteppingStone5_Recipe createNewRecipe() {
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList<String>();
        boolean addMoreIngredients = true;

        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        
        //correct data type & Scanner assignment method for servings variable
        int servings = scnr.nextInt();
               
        do {
            System.out.println("Please enter the ingredient name or type end if you are finished entering ingredients: ");
            // clears the "\n" left from previous scnr object, allows inputting multiple words for ingredients
            scnr.nextLine();
            String ingredientName = scnr.nextLine();
            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
            } else {           
                recipeIngredients.add(ingredientName);
        
                System.out.println("Please enter the ingredient amount: ");
                int ingredientAmount = scnr.nextInt();
            
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                
                // Cumulitive calcuation of total calories
                totalRecipeCalories = totalRecipeCalories + (ingredientCalories * ingredientAmount);            
            }
           
       } while (addMoreIngredients == true); {
        
        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, 
            servings, recipeIngredients, totalRecipeCalories);
        recipe1.printRecipe(); 
        return recipe1;       
        }
    }
}



/**
 * Final Project
 * 
 * For your Final Project:
 * 
 * 1. Modify this code to develop a Recipe class:
 *	a. change the void main method createNewRecipe() that returns a Recipe 
 * 	 
 * 2. FOR FINAL SUBMISSION ONLY:Change the ArrayList type to an 
 *		Ingredient object.  When a user adds an ingredient to the recipe, 
 * 		instead of adding just the ingredient name, you will be adding the 
 *		actual ingredient including name, amount, measurement type, calories.
 *	For the Milestone Two submission, the recipeIngredients ArrayList can
 *	remain as a String type.
 *
 * 3. Adapt the printRecipe() method to print the amount and measurement
 * 	type as well as the ingredient name.
 *
 * 4. Create a custom method in the Recipe class. 
 *      Choose one of the following options:
 *
 * 	a. print out a recipe with amounts adjusted for a different 
 * 		number of servings
 * 
 * 	b. create an additional list or ArrayList that allow users to 
 * 		insert step-by-step recipe instructions
 *
 * 	c. conversion of ingredient amounts from 
 * 		English to metric (or vice versa)
 *
 * 	d. calculate select nutritional information 
 *
 * 	e. calculate recipe cost
 * 
 *      f. propose a suitable alternative to your instructor
 * 
 */ 

