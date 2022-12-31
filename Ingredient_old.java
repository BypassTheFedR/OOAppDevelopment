package SteppingStones;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Ingredient {
    private String nameOfIngredient;
    private double ingredientAmount;
    private String unitMeasurement;
    private double numberCaloriesPerUnit;
    private double totalCalories;
    /*
     * set and get ingredient name
     */
    public void setIngredientName (String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;         
    } 

    public String getIngredientName() {
        return this.nameOfIngredient;
    }

    /*
     * set and get ingredient amount
     */
    public void setIngredientAmount (double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;         
    } 

    public double getIngredientAmount() {
        return this.ingredientAmount;
    }

    /*
     * set and get unit of measurement
     */
    public void setUnitMeasurement (String unitMeasurement) {
        this.unitMeasurement = unitMeasurement;         
    } 

    public String getUnitMeasurement() {
        return this.unitMeasurement;
    }

    /*
     * set and get number of calories per unit
     */
    public void setNumberCaloriesPerUnit (double numberCaloriesPerUnit) {
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;         
    } 

    public double getNumberCaloriesPerUnit() {
        return this.numberCaloriesPerUnit;
    }
    /*
     * Calculates the total calories for the ingredient and get method for total calories
     */
    public void calculateTotalCalories () {
        this.totalCalories = this.numberCaloriesPerUnit * this.ingredientAmount;
    }

    public double getIngredientCalories () {
        return this.totalCalories;
    }

    // constructor method
    public Ingredient() {
        this.nameOfIngredient = "";
        this.ingredientAmount = -1.0;
        this.unitMeasurement = "";
        this.numberCaloriesPerUnit = -1;
        this.totalCalories = 0.0;
    }

    public Ingredient(String nameOfIngredient, double ingredientAmount, String unitMeasurement, double numberCaloriesPerUnit, double totalCalories) {
        this.nameOfIngredient = nameOfIngredient;
        this.ingredientAmount = ingredientAmount;
        this.unitMeasurement = unitMeasurement;
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;
        this.totalCalories = ingredientAmount;
    }

    public Ingredient enterNewIngredient() {
        
        Scanner scnr = new Scanner(System.in);

        // Asks the user for the name of the ingredient and stores it in nameOfIngredient
        // System.out.println("Please enter the name of the ingredient: ");
        if (scnr.hasNext()) {
            nameOfIngredient = scnr.next();
        }

        // Asks the user for the amount of the ingredient and stores it in ingredientAmount
        // If the user enters a float value that is out of bounds, prompts user to try again.
        // If the user enters a value that is not a number. The program termiantes without adding the ingredient.
        System.out.println("Please enter the amount of the ingredient to be used: ");
        if (scnr.hasNextDouble()) {
            ingredientAmount = scnr.nextDouble();
            double minIngredient = 1.0;
            double maxIngredient = 100.0;


            if (ingredientAmount >= minIngredient && ingredientAmount <= maxIngredient) {
              System.out.println(ingredientAmount + " is a valid amount!");
            }
            else {
              System.out.println(ingredientAmount + " is a not a valid amount!");
              System.out.println("Please enter the amount of the ingredient (between 1 and 100): ");
              ingredientAmount = scnr.nextDouble();
  
                if (ingredientAmount >= minIngredient && ingredientAmount <= maxIngredient) {
                    System.out.println(ingredientAmount + " is a valid amount!");
                }
                else {
                    System.out.println(ingredientAmount + " is a not a valid amount! Sorry you are out of attempts.");
                    System.exit(0);
                }
            }
        } 
        else {
             System.out.println("Error: That is not a number. Terminating program, your ingredient was not added.");
             System.exit(0);
        }

        // Asks the user for the type of measurement used and stores it in unitMeasurement
        // POTENTIAL FUTURE FUNCTIONALITY: select from an Array list of units of measurement
        System.out.println("Please enter the unit of measurement (e.g. cup, oz. etc.): ");
        if (scnr.hasNext()) {
            unitMeasurement = scnr.next();
        }

        // Asks the user for the number of calories per unit of measurement and stores it in numberCaloriesPerUnit.
        // If user does not enter an integer, the program terminates without adding ingredient.
        System.out.println("Please enter the number of calories per unit of measurement: ");
        if (scnr.hasNextInt()) {
            numberCaloriesPerUnit = scnr.nextInt();
        }
        else {
            System.out.println("Error: That is not a number. Terminating program, your ingredient was not added.");
            System.exit(0);
        }
        
        // Calculates total calories for the ingredient
        totalCalories = ingredientAmount * numberCaloriesPerUnit;
        
        // Outputs the number of calories in the ingredient for the recipe
        System.out.println("The recipe uses " + ingredientAmount + " " + unitMeasurement + " of " + nameOfIngredient + " and has " + totalCalories + " calories.");
        Ingredient ingredients = new Ingredient(nameOfIngredient, ingredientAmount, unitMeasurement, numberCaloriesPerUnit, totalCalories);
        return ingredients;
    }
}