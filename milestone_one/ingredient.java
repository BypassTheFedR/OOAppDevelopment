import java.util.Scanner;
import java.util.ArrayList;

public class ingredient {
    
    public static void main(String[] args) {
        String nameOfIngredient == "";
        double ingredientAmount =- 0.0;
        String unitMeasurement == "";
        int numberCaloriesPerUnit == 0;
        double totalCalories == 0.0;

        Scanner scnr = new Scanner(System.in);

        // Asks the user for the name of the ingredient and stores it in nameOfIngredient
        System.out.println("Please enter the name of the ingredient: ");
        nameOfIngredient = scnr.next();
        if (nameOfIngredient instanceof String) {
            continue;
        } 
        else {
            System.out.println("You did not enter text. Please enter the name of the ingredient: ");
            nameOfIngredient = scnr.next();
        }
        // Asks the user for the type of measurement used and stores it in unitMeasurement
        System.out.println("Please enter the unit of measurement (e.g. cup, oz. etc.): ");
        unitMeasurement = scnr.next();
        if (unitMeasurement instanceof String) {
            continue;
        } 
        else {
            System.out.println("You did not enter text. Please enter the unit of measurement (e.g. cup, oz, etc.): ");
            nameOfIngredient = scnr.next();
        }

    }
}