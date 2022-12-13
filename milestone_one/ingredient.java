import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ingredient {
    
    public static void main(String[] args) {
        String nameOfIngredient = "";
        double ingredientAmount = -1.0;
        String unitMeasurement = "";
        int numberCaloriesPerUnit = -1;
        double totalCalories = 0.0;

        Scanner scnr = new Scanner(System.in);

        // Asks the user for the name of the ingredient and stores it in nameOfIngredient
        System.out.println("Please enter the name of the ingredient: ");
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
    }
}