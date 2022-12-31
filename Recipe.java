import java.util.ArrayList;
import java.util.Scanner;

import SteppingStones.Ingredient;

public class Recipe {
    /*
     * Initialize variables for the class;
     */
    private String recipeName;
    private int servings;
    private ArrayList<Ingredient> recipeIngredients = new ArrayList<>(); // retrieved from the Ingredients class
    private double totalRecipeCalories;
    
    public String getRecipeName() { // Get recipeName
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName; // Sets recipeName for this object.
    }

    public int getServings() { // Get servings
        return servings;
    }

    public void setServings(int servings) {// Sets servings
        this.servings = servings;
    }

    public ArrayList<Ingredient> getRecipeIngredients() { // Get recipe ingredients
        return recipeIngredients;    
    }

    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) { // Sets the recipe ingredients
        this.recipeIngredients = recipeIngredients;

        /*
         * For help later:
         * https://stackoverflow.com/questions/33060592/getters-and-setters-for-arraylists-in-java 
         */
    }

    public double getTotalRecipeCalories() { // Gets the total recipe calories
        return totalRecipeCalories;
    }

    public void setTotalRecipeCalories(double totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }

    /*
     * Constructor methods
     */
    public Recipe() {
        recipeName = "";
        servings = 0;
        recipeIngredients = new ArrayList<>();
        totalRecipeCalories = 0.0; 
    }
    
    public Recipe(String recipeName, int servings, ArrayList<Ingredient> recipeIngredients, double totalRecipeCalories) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories; 
    }

    public Recipe addNewRecipe(){
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("What is the name of your recipe?");
        setRecipeName(scnr.nextLine()); // get user input for the recipe name

        System.out.println("How many servings does your recipe make?");
        setServings(scnr.nextInt()); // get user input for the number of servings
        System.out.println(); // clears the '\n' after nextInt

        ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();
        recipeIngredients.enterNewIngredient();

        Recipe newRecipe = new Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
        return newRecipe;
    }
    

}