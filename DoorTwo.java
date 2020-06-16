package discussions;

import java.util.Scanner;

public class DoorTwo {

	// Create Scanner object
	static Scanner userInput = new Scanner(System.in);

	//Default values for door variables
	private int force = 0;
	private String doorMessage = ""; 

	//Class methods
	public int getForce() {
		return force;
	}
	// set door to open or closed based on last position and if
	//force has been applied since.
	public void setForce (int forceInput) {
		force = forceInput;
	}
	//set output message based on force and set doors new status of
	// open or closed based on force applied.
	public String getForceMessage(int forceApplied) {
		forceApplied++;

		// Setting the output message
		switch (forceApplied) {
		case 1: this.doorMessage = "Did you even touch it? Door did nothing.";
				break;
		case 2: doorMessage = "Did you blow on it? Door barely feels! Door is still open.";
				break;
		case 3: doorMessage = "Weak! Try harder next time. Door moved some but is still open.";
				break;
		case 4: doorMessage = "Better! Door feels respect and Door is closed.";
				break;
		case 5: doorMessage = "Very firm! Maybe a little too firm. Door is sore and closed!";
				break;
		case 6: doorMessage = "TOO MUCH! ARGGggg... Door is closed but shattered and useless!!";
				break;
		default: doorMessage = "Door is unsure what has happened. :/";
				break;
		}
		return doorMessage;

	}
	// Constructor of the door class object door
	public DoorTwo(int force) {

		this.force = force;
	}
    
	// Main function that executes rest of class
	public static void main(String[] args) {

	}
}
