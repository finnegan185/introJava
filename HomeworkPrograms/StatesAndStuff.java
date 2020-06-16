/* File: StatesAndStuff
 * Author: Zachary Finnegan
 * Date: December 9th, 2018
 * Purpose: Create a program that outputs a states flower and bird based on 
 * user input. The program loops until user asks to stop or all 50 states have been entered.
 * At the end of the program an output message summarizes all states entered.
 */

package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;


public class StatesAndStuff {
	//Fields, constant, scanner and hashmap creation below
	private final static String[] STATES = {"alabama","alaska","arizona","arkansas","california","colorado",
			"connecticut","delaware","florida","georgia","hawaii","idaho","illinois","indiana","iowa",
			"kansas","kentucky","louisiana","maine","maryland","massachusetts","michigan","minnesota",
			"mississippi","missouri","montana","nebraska","nevada","new hampshire","new jersey","new mexico",
			"new york","north carolina","north dakota","ohio","oklahoma","oregon","pennsylvania",
			"rhode island","south carolina","south dakota","tennessee","texas","utah","vermont",
			"virginia","washington","west virginia","wisconsin","wyoming"};
	private static ArrayList<String> userEnteredStates = new ArrayList<String>();
	static Map<String, String> stateMap = new HashMap<String, String>();
	public static Scanner userInput = new Scanner(System.in);
	//This field tracks the number of states the user has entered
	private static int userEnteredStatesCount = 0;

	//Method returning state, flower and bird value for user entered state via hashmap
	public static String getStateBirdFlower(String stateName) {
		stateMap.put("alabama", "Alabama's\nFlower: Camellia\nBird: Yellowhammer");
		stateMap.put("alaska", "Alaska's\nFlower: Forget-me-not\nBird: Willow Ptarmigan");
		stateMap.put("arizona", "Arizona's\nFlower: Saguaro Cactus Blossom\nBird: Cactus Wren");
		stateMap.put("arkansas", "Arkansas'\nFlower: Apple Blossom\nBird: Mockingbird");
		stateMap.put("california", "California's\nFlower: California Poppy\nBird: California Quail");
		stateMap.put("colorado", "Colorado's\nFlower: Rocky Mountain Columbine\nBird: Lark Bunting");
		stateMap.put("connecticut", "Connecticut's\nFlower: Mountain Laurel\nBird: American Robin");
		stateMap.put("delaware", "Delaware's\nFlower: Peach Blossom\nBird: Blue Hen Chicken");
		stateMap.put("florida", "Florida's\nFlower: Orange Blossom\nBird: Mockingbird");
		stateMap.put("georgia", "Georgia's\nFlower: Cherokee Rose\nBird: Brown Thrasher");
		stateMap.put("hawaii", "Hawaii's\nFlower: Hibiscus\nBird: Nene");
		stateMap.put("idaho", "Idaho's\nFlower: Syringa\nBird: Mountain Bluebird");
		stateMap.put("illinois", "Illinois'\nFlower: Purple Violet\nBird: Cardinal");
		stateMap.put("indiana", "Indiana's\nFlower: Peony\nBird: Cardinal");
		stateMap.put("iowa", "Iowa's\nFlower: Wild Prairie Rose\nBird: Goldfinch");
		stateMap.put("kansas", "Kansas'\nFlower: Sunflower\nBird: Western Meadowlark");
		stateMap.put("kentucky", "Kentucky's\nFlower: Goldenrod\nBird: Cardinal");
		stateMap.put("louisiana", "Lousiana's\nFlower: Magnolia\nBird: Eastern Brown Pelican");
		stateMap.put("maine", "Maine's\nFlower: White Pine Cone and Tassel\nBird: Chickadee");
		stateMap.put("maryland", "Maryland's\nFlower: Black-Eyed Susan\nBird: Baltimore Oriole");
		stateMap.put("massachusetts", "Massachusetts'\nFlower: Mayflower\nBird: Chickadee");
		stateMap.put("michigan", "Michigan's\nFlower: Apple Blossom\nBird: Robin");
		stateMap.put("minnesota", "Minnesota's\nFlower: Pink and White Lady Slipper\nBird: Common Loon");
		stateMap.put("mississippi", "Mississippi's\nFlower: Magnolia\nBird: Mockingbird");
		stateMap.put("missouri", "Missouri's\nFlower: White Hawthorn Blossom\nBird: Bluebird");
		stateMap.put("montana", "Montana's\nFlower: Bitterroot\nBird: Western Meadowlark");
		stateMap.put("nebraska", "Nebraska's\nFlower: Goldenrod\nBird: Western Meadowlark");
		stateMap.put("nevada", "Nevada's\nFlower: Sagebrush\nBird: Mountain Bluebird");
		stateMap.put("new hampshire", "New Hampshire's\nFlower: Purple Lilac\nBird: Purple Finch");
		stateMap.put("new jersey", "New Jersey's\nFlower: Violet\nBird: Eastern Goldfinch");
		stateMap.put("new mexico", "New Mexico's\nFlower: Yucca Flower\nBird: Roadrunner");
		stateMap.put("new york", "New York's\nFlower: Rose\nBird: Bluebird");
		stateMap.put("north carolina", "North Carolina's\nFlower: Dogwood\nBird: Cardinal");
		stateMap.put("north dakota", "North Dakota's\nFlower: Wild Prairie Rose\nBird: Western Meadowlark");
		stateMap.put("ohio", "Ohio's\nFlower: Scarlet Carnation\nBird: Cardinal");
		stateMap.put("oklahoma", "Oklahoma's\nFlower: Mistletoe\nBird: Scissor-Tailed Flycatcher");
		stateMap.put("oregon", "Oregon's\nFlower: Oregon Grape\nBird: Western Meadowlark");
		stateMap.put("pennsylvania", "Pennsylvania's\nFlower: Mountain Laurel\nBird: Ruffed Grouse");
		stateMap.put("rhode island", "Rhode Island's\nFlower: Violet\nBird: Rhode Island Red");
		stateMap.put("south carolina", "South Carolina's\nFlower: Yellow Jessamine\nBird: Great Carolina Wren");
		stateMap.put("south dakota", "South Dakota's\nFlower: Pasque Flower\nBird: Ring-Necked Pheasant");
		stateMap.put("tennessee", "Tennessee's\nFlower: Iris\nBird: Mockingbird");
		stateMap.put("texas", "Texas'\nFlower: Bluebonnet\nBird: Mockingbird");
		stateMap.put("utah", "Utah's\nFlower: Sego Lily\nBird: California Seagull");
		stateMap.put("vermont", "Vermont's\nFlower: Red Clover\nBird: Hermit Thrush");
		stateMap.put("virginia", "Virginia's\nFlower: Dogwood\nBird: Cardinal");
		stateMap.put("washington", "Washington's\nFlower: Pink Rhododendron\nBird: Willow Goldfinch");
		stateMap.put("west virginia", "West Virginia's\nFlower: Rhododendron\nBird: Cardinal");
		stateMap.put("wisconsin", "Wisconsin's\nFlower: Wood Violet\nBird: Robin");
		stateMap.put("wyoming", "Wyoming's\nFlower: Indian Paintbrush\nBird: Western Meadowlark");
		return stateMap.get(stateName.toLowerCase());
	} //end of getStateBirdFlower
	
	//Method for entering user input into userEnteredStates array
	public static boolean checkAddUserState(String userState) {
		//This loops through STATES to see if user input is a State and checks if it has already been entered
		for(String s: STATES) {
			if(s.equals(userState) && !userEnteredStates.contains(userState)) {
				//adds values to fields to track what has been entered and how many states have been entered
				userEnteredStates.add(userState);
				userEnteredStatesCount++;
				return true;
			}
		}
		//This is activated if user re-entered a State and asks for a new state
		if(userEnteredStates.contains(userState)) {
			System.out.print("You already entered that State. ");
			return false;
		}
		//Catch all function
		System.out.print("Your input wasn't recognized. ");
		return false;
	} //end of checkAddUserState
	
	//Getters not utilized
	public static String getUserEnteredStates() {
		return userEnteredStates.toString();
	}
	
	//Class constructor
	public StatesAndStuff() {
		
	}
	
	public static void main(String[] args) {
		//Main program asks user for input uses scanner to collect it.
		System.out.println("Please enter a State or 'none' to stop: ");
		String inputState = userInput.nextLine();
		String trimInputState = inputState.trim();
		//loop that ends when all 50 states have been entered or user enters none to stop
		//within the loop userInput is set to lower case so it is recognized by the arrays and hashmap
		//within the loop the other methods of the program are called
		while(userEnteredStatesCount <= 49 && !trimInputState.equalsIgnoreCase("None")) {
			if(checkAddUserState(trimInputState.toLowerCase())) {
				System.out.println(getStateBirdFlower(trimInputState.toLowerCase()));
			} else {
				System.out.println("Please enter a new State or None to stop: ");
				inputState = userInput.nextLine();
				trimInputState = inputState.trim();
				continue;
			}
			if(userEnteredStatesCount == 50) {
				break;
			}
			System.out.println("Please enter a new State or 'none' to stop: ");
			inputState = userInput.nextLine();
			trimInputState = inputState.trim();
		}
		System.out.println("**** Thank you ****\nA Summary report for each" +
		          " State, Bird, and Flower you entered is: ");
		for(String p: userEnteredStates) {
			System.out.println("----\n" + getStateBirdFlower(p));
		}
		System.out.println("Please utilize this program again!");
	} //end of main method

} //end of program
