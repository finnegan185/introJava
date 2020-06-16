/* File: HeadPhone.java
 * Author: Zachary Finnegan
 * Date: 12/02/2018
 * Purpose: Create the headphone class for homework #3
 */
package Homework;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class HeadPhone {
  //constant declaration
  final int LOW = 1;
  final int MEDIUM = 2;
  final int HIGH = 3;
  
  //private field declaration
  private int volume = MEDIUM;
  private boolean pluggedIn = false;
  private String manufacturer = "Bose";
  private Color headPhoneColor = Color.black;
  private String headPhoneModel = "Super";
  static Map<Color, String> colorMap = new HashMap<Color, String>();
  
  //getters
  public int getVolume() {
	  return volume;
  }
  public boolean getPluggedIn() {
	  return pluggedIn;
  }
  public String getManufacturer() {
	  return manufacturer;
  }
  public String getHeadPhoneColor(){
    //creating a color map so Color class values can be translated
  	// into normal color names
      colorMap.put(Color.BLACK, "Black");
      colorMap.put(Color.RED, "Red");
      colorMap.put(Color.BLUE, "Blue");
      colorMap.put(Color.CYAN, "Cyan");
      colorMap.put(Color.DARK_GRAY, "Dark Gray");
      colorMap.put(Color.GRAY, "Gray");
      colorMap.put(Color.GREEN, "Green");
      colorMap.put(Color.LIGHT_GRAY, "Light Gray");
      colorMap.put(Color.MAGENTA, "Magenta");
      colorMap.put(Color.ORANGE, "Orange");
      colorMap.put(Color.PINK, "Pink");
      colorMap.put(Color.WHITE, "White");
      colorMap.put(Color.YELLOW, "Yellow");
  	return colorMap.get(headPhoneColor);
  }//end getGuitarColor
  public String getHeadPhoneModel() {
	  return headPhoneModel;
  }
  
  //Setters
  public void changeVolume(int newVolume) {
	  if (newVolume >= 1 && newVolume <= 3) {
		  if (newVolume == 1) {
			  this.volume = LOW;
		  } else if (newVolume == 2) {
			  this.volume = MEDIUM;
		  } else {
			  this.volume = HIGH;
		  }
	  } else {
		  System.out.println("You entered an invalid value. Volume set to default");
	      this.volume = MEDIUM;
	  }
  }
  public void setPluggedIn(boolean newPluggedState) {
	  this.pluggedIn = newPluggedState;
  }
  public void setManufacterer(String newManufacturer) {
	  this.manufacturer = newManufacturer;
  }
  public void setHeadPhoneColor(Color newColor) {
	  this.headPhoneColor = newColor;
  }
  public void setHeadPhoneModel(String newModel) {
	  this.headPhoneModel = newModel;
  }
  
  //No Argument Constructor
  public HeadPhone() {
	  
  }
  //To string
  public String toString() {
	  String stringVolume = Integer.toString(volume);
	  String stringPluggedIn = Boolean.toString(pluggedIn);
	  String stringColor = getHeadPhoneColor();
	  return ("Volume is " + stringVolume + ". Plugged in = \n" +
	        stringPluggedIn + ". Manufacturer = " + manufacturer + ". Color = \n" 
	        + stringColor + ". Head Phone Model = " + headPhoneModel + ".");
  }
  public static void main(String[] args) {
	  
  }
}
