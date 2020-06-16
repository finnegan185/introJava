/* File: USCrimeApp.java
 * Author: Zachary Finnegan
 * Date: 12/16/2018
 * Purpose: This program creates a menu interface of various questions about crime data between 
 * 1994 and 2013. The user enters the number of the question they wanted answered into the console
 * and the program displays the answer derived from the USCrimesClass. The data used to answer the menu questions 
 * comes from the Crime.csv file that is imported through commandline arguments. The file is then sent to the
 * USCrimesClass for parsing and manipulation.
 */

package Homework;
import java.util.Scanner;
import java.io.*;


public class USCrimeApp {
	//time at start of program for tracking elapsed time
	private static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) {
		//filename input, USCrimeClass object creation and USCrimeClass value array creation
		//via passing commandline filename to USCrimeClass object crimeData
		String crimeFileName = args[0];
		USCrimesClass crimeData = new USCrimesClass();
		try {
			crimeData.createCrimeStatsArray(crimeFileName);
		} catch (FileNotFoundException e) {
			System.out.print("File name was not found. Please try again.");
			e.printStackTrace();
		}
		
		//beginning of front end part of the application
		System.out.println("***********Welcome to the US Crime Statistical Application.*****************\n");
		//boolean value that determines when to exit while loop
		boolean isQEntered = false;
		//scanner object creation for user input and variable to hold user input
		Scanner userInput = new Scanner(System.in);
		String userSelection = "";
		//Menu item strings
		String qOne = "1.   What were the percentages in population growth for each consecutive " +
				"year from 1994-2013?\n";
		String qTwo = "2.   What year was the murder rate the highest?\n";
		String qThree = "3.   What year was the murder rate the lowest?\n";
		String qFour = "4.   What year was the robbery rate the highest?\n";
		String qFive = "5.   What year was the robbery rate the lowest?\n";
		String qSix = "6.   What year was the violent crime rate the highest?\n";
		String qSeven = "7.   What year was the violent crime rate the lowest?\n";
		String qEight = "8.   How much was murder reduced between the peak year and 2013?\n";
		String qNine = "9.   How much was robbery reduced between the peak year and 2013?\n";
		String qTen = "10.  How much was violent crime reduced between the peak year and 2013?\n";
		String qEleven = "11.  Is the United States a safer place than it used to be?\n";
		String qQ = "Q.   Quite the program.\n\n";
		
		//while loop that runs the application until Q is entered
		while(isQEntered == false) {
			
			//User input request print out and menu item printout
			System.out.println("Enter the number of the question you want answered." +
					" Enter 'Q' to quit the program:\n");
			System.out.println(qOne + qTwo + qThree + qFour + qFive + qSix + 
					qSeven + qEight + qNine + qTen + qEleven + qQ + "Enter your selection: ");
			userSelection = userInput.nextLine();
			
			//switch statement that translates user selection to requested output or quit
			switch (userSelection) {
			case "1": System.out.println(crimeData.getPopulationGrowth());
					break;
			case "2": System.out.println(crimeData.getMaxMurderYear());
					break;
			case "3": System.out.println(crimeData.getMinMurderYear());
					break;
			case "4": System.out.println(crimeData.getMaxRobberyYear());
					break;
			case "5": System.out.println(crimeData.getMinRobberyYear());
					break;
			case "6": System.out.println(crimeData.getMaxViolentCrimeYear());
					break;
			case "7": System.out.println(crimeData.getMinViolentCrimeYear());
					break;
			case "8": System.out.println(crimeData.getMurderReduction());
					break;
			case "9": System.out.println(crimeData.getRobberyReduction());
					break;
			case "10": System.out.println(crimeData.getViolentCrimeReduction());
					break;
			case "11": System.out.println("Yes.\n");
					break;
			case "Q": System.out.println("Thank you for using the Crime Statistical Application.\n");
					isQEntered = true;
					break;
			case "q": System.out.println("You aren't great at following directions but okay.\n" + 
					"Thank you for using the Crime Statistical Application.\nPlease enter capital 'Q' next time.");
					isQEntered = true;
					break;
			default: System.out.println("Your input was not recognized please try again.\n");
					break;
			} //end of switch
			
			//this section allows user to control when menu re-appears allowing user to read output without scrolling up
			if (isQEntered == false) {
				System.out.println("Enter any input to continue to menu.");
				if (userInput.hasNextLine()) {
					@SuppressWarnings("unused")
					//creates a place to store "any input" so as not to be used in menu item selection
					String dump = userInput.nextLine();
				}
			}	
		} // end of while loop
		
		//close scanner input stream
		userInput.close();
		//program end time variable, run time calculation and print out
		long endTime = System.currentTimeMillis();
		long timeElapsedSeconds = (endTime - startTime)/1000;
		System.out.println("Your program usage time was " + timeElapsedSeconds + " seconds.");

	}

}
