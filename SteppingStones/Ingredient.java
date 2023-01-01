package SteppingStones;

import java.util.Scanner;

public class Ingredient {
    private String nameOfIngredient;
    private double ingredientAmount;
    private String unitMeasurement;
    private double numberCaloriesPerUnit;
    private double totalIngredientCalories;
    private double totalRecipeCalories;
    
    /*
     * set and get ingredient name
     */

    public void setNameOfIngredient (String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;         
    } 

    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    /*
     * set and get ingredient amount
     */
    public void setIngredientAmount (double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;         
    } 

    public double getIngredientAmount() {
        return ingredientAmount;
    }

    /*
     * set and get unit of measurement
     */
    public void setUnitMeasurement (String unitMeasurement) {
        this.unitMeasurement = unitMeasurement;         
    } 

    public String getUnitMeasurement() {
        return unitMeasurement;
    }

    /*
     * set and get number of calories per unit
     */
    public void setNumberCaloriesPerUnit (double numberCaloriesPerUnit) {
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;         
    } 

    public double getNumberCaloriesPerUnit() {
        return numberCaloriesPerUnit;
    }
    /*
     * Calculates the total calories for the ingredient and get method for total calories
     */
    public void calculateTotalCalories () {
        totalIngredientCalories = numberCaloriesPerUnit * ingredientAmount;
    }

    public double getTotalCalories () {
        return totalIngredientCalories;
    }

    public double getIngredientCalories () {
        return this.totalIngredientCalories;
    }

    // constructor method
    public Ingredient() {
        nameOfIngredient = "";
        ingredientAmount = -1.0;
        unitMeasurement = "";
        numberCaloriesPerUnit = -1;
        totalIngredientCalories = 0.0;
    }

    public Ingredient(String nameOfIngredient, double ingredientAmount, String unitMeasurement, double numberCaloriesPerUnit, double totalCalories, double totalRecipeCalories) {
        this.nameOfIngredient = nameOfIngredient;
        this.ingredientAmount = ingredientAmount;
        this.unitMeasurement = unitMeasurement;
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;
        this.totalIngredientCalories = ingredientAmount;
        this.totalRecipeCalories = totalRecipeCalories;
    }

    public Ingredient enterNewIngredient() {
        double totalRecipeCalories = 0.0;
        double minIngredient = 1.0;
        double maxIngredient = 100.0;
        String moreIngredients = "";
        boolean addMoreIngredients = true;
        Scanner scnr = new Scanner(System.in);

        while (addMoreIngredients == true) {
            System.out.println("What is the name of the next ingredient? (type end if done adding ingredients)"); // Asks the user for nameOfIngredient
            nameOfIngredient = scnr.nextLine();
            /*
             * Section for getting the amount of the ingredient
             */
            System.out.println("Please enter the amount of the ingredient to be used: "); // Asks the user for the amount of the ingredient and stores it in ingredientAmount
            ingredientAmount = scnr.nextDouble();
            
            if (ingredientAmount < minIngredient || ingredientAmount > maxIngredient) {
                System.out.println(ingredientAmount + " is not a valid amount!");
                System.out.println("Please enter the amount of the ingredient (between 1 and 100): ");

                ingredientAmount = scnr.nextDouble();
                if (ingredientAmount < minIngredient || ingredientAmount > maxIngredient) {
                    System.out.println(ingredientAmount + " is a not a valid amount! Sorry you are out of attempts.");
                    System.exit(0);
                }
                 
            }
            /*
             * Section for getting unit of measure
             */
            System.out.println("Please enter the unit of measurement (e.g. cup, oz. etc.): ");
            if (scnr.hasNext()) {
                unitMeasurement = scnr.next();
            }
            /*
             * Section for getting the calories per measurement
             */
            System.out.println("Please enter the number of calories per unit of measurement: ");
            if (scnr.hasNext()) {
                numberCaloriesPerUnit = scnr.nextInt();
            }
            else {
                System.out.println("Error: That is not a number. Terminating program, your ingredient was not added.");
                System.exit(0);
            }
            // Calculates total calories for the ingredient
            totalIngredientCalories = ingredientAmount * numberCaloriesPerUnit;
            totalRecipeCalories = totalRecipeCalories + totalIngredientCalories;
            System.out.println("The recipe uses " + ingredientAmount + " " + unitMeasurement + " of " + nameOfIngredient + " and has " + totalIngredientCalories + " calories.");
            scnr.nextLine();
            System.out.println();// Makes a blank line for readability.
            System.out.println("Are there are more ingredients for your recipe? (y or n)");
            moreIngredients = scnr.nextLine();
            if (moreIngredients.toLowerCase().equals("n")) {
                System.out.println("This code exectued");
                addMoreIngredients = false;
            }
        } 
        Ingredient ingredients = new Ingredient(nameOfIngredient, ingredientAmount, unitMeasurement, numberCaloriesPerUnit, totalIngredientCalories, totalRecipeCalories);
        return ingredients;
    }   
}