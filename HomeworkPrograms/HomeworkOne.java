/* File:	UMUC_Homework1.java
 * Author:	Zachary Finnegan
 * Date:	31-10-2018
 * Purpose:	Homework 1
 */

package Homework;

//import user input tool
import java.util.Scanner;

public class HomeworkOne {
  // Create userinput scannner object
  static Scanner userInput = new Scanner(System.in); 

  //Open Main
  public static void main(String[] args) { 

  //Collect inputs and confirm they are correct
  System.out.print("Enter your Student EMPLID(0-999999): ");
  int studentId = 0;

  if (userInput.hasNextInt()) { 

    studentId = userInput.nextInt();

  } else { 

	System.out.println("Not an integer.");

  }//End of if/else statement

  System.out.print("Enter your quiz 1 percentage score (0.0-100.0): ");
  double quiz1 = 0;

  if (userInput.hasNextDouble()) { 

    quiz1 = userInput.nextDouble();

  } else { 

    System.out.println("Not a double.");

  } //End of if/else statement
	      
  System.out.print("Enter your quiz 2 percentage score (0.0-100.0): ");
  double quiz2 = 0;

  if (userInput.hasNextDouble()) { 

	  quiz2 = userInput.nextDouble();

  } else { 

    System.out.println("Not a double.");

  } //End of if/else statement

  System.out.print("Enter your quiz 3 percentage score (0.0-100.0): ");
  double quiz3 = 0;

  if (userInput.hasNextDouble()) { 

    quiz3 = userInput.nextDouble();

  } else { 

    System.out.println("Not a double.");

  } //End of if/else statement

  System.out.print("Enter your age in months (0-1440): ");
  int ageMonths = 0;

  if (userInput.hasNextInt()) { 

    ageMonths = userInput.nextInt();

  } else { 

    System.out.println("Not an Int.");

  } //End of if/else statement
	    
  System.out.print("Enter the current Temperature in degrees Celsius: ");
  double tempC = 0.0;

  if (userInput.hasNextDouble()) { 

    tempC = userInput.nextDouble();

  } else { 

    System.out.println("Not a double.");

  } //End of if/else statment
	    
  // Calculations for output
  double avgQuizScore = ((quiz1 + quiz2 + quiz3) / 3);
  int ageYears = ageMonths/12;
  double tempF = (tempC*(9/5.0)) + 32;

  //create degree symbol variable
  String degreeSymbol = "\u00b0";

  // Printing entered variables and calculated variables
  System.out.println("\n***Thank you***");
  System.out.println("Student EMPLID: " + studentId);
  System.out.println("Quiz 1 Score: " + quiz1);
  System.out.println("Quiz 2 Score: " + quiz2);
  System.out.println("Quiz 3 Score: " + quiz3);
  System.out.println("Average quiz score: " + avgQuizScore);
  System.out.println("Age in months: " + ageMonths);
  System.out.println("Age in years: " + ageYears);
  System.out.println("Temperature in Celsius: " + tempC + degreeSymbol + "C");
  System.out.println("Temperature in Fahrenheit: " + tempF + degreeSymbol + "F");

  }// End Main

}// End Class

