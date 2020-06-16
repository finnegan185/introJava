package discussions;
import java.util.Scanner;

public class Door {
	
  // Create Scanner object
  public Scanner userInput = new Scanner(System.in);
  
  //Default values for door variables
  private boolean open = false;
  private int force = 0;
  private String doorMessage = ""; 
	  
  //Class methods
  public boolean getOpen() {
    return open;
  }
  public int getForce() {
	  return force;
  }
  // set door to open or closed based on last position and if
  //force has been applied since.
  public void setOpen(boolean openDoor) {
	  if (openDoor) {
		  open = true;
	  } else {
		  open = false;
	  }
  }
  //set output message based on force and set doors new status of
  // open or closed based on force applied.
  public String setForceMessage(int forceApplied, boolean open) {
	  forceApplied++;
	  String doorStatus = "";
	  
	  //setting doorStatus open or closed from previous value
	  if (getOpen() && forceApplied != 6) {
		  doorStatus = "closed";
	  } else if (getOpen() && forceApplied == 6) {
		  doorStatus = "sort of closed, but mostly destroyed...";
	  } else if (getOpen()==false && forceApplied != 6) {
		  doorStatus = "open";
	  } else if (getOpen()==false && forceApplied == 6 ) {
		  doorStatus = "no longer on the hinges...";
	  } else {
		  System.out.println("Something went wrong with elseif");
	  }
	  
	  // Setting the output message
	  switch (forceApplied) {
	  case 1: this.doorMessage = "Did you even touch it? Door did nothing.";
	  		  break;
	  case 2: doorMessage = "Did you blow on it? Door barely feels! Door is still " + 
	  		  doorStatus + ".";
	          break;
	  case 3: doorMessage = "Weak! Try harder next time. Door moved some but is " +
	          doorStatus + ".";
			  break;
	  case 4: doorMessage = "Better! Door feels respect and Door is " + 
		  	  doorStatus + ".";
	  		  break;
	  case 5: doorMessage = "Very firm! Maybe a little too firm. Door is sore and " +
	  		  doorStatus + "!";
	  		  break;
	  case 6: doorMessage = "TOO MUCH! ARGGggg... Door is " + doorStatus + "!!";
	          break;
	  default: doorMessage = "Door is unsure what has happened. :/";
			   break;
	  }
	  return doorMessage;

  }
  // Constructor of the door class object door
  public Door(boolean open, int force) {
    this.open = open;
    this.force = force;
  }

  public static void main(String[] args) {
	System.out.print("Shall we shut the door?");
  }
}