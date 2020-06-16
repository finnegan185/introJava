package discussions;
import java.util.Scanner;

public class DoorTest {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	//Print message asking for force input
	System.out.print("How much force should we use to close Door? (0-5): ");
	int forceInput = userInput.nextInt();
	
	// Uses setter method setforce
	DoorTwo Door = new DoorTwo(forceInput);
	
	//get message
	String messageOut = Door.getForceMessage(forceInput);
	System.out.println(messageOut);
	}
}
