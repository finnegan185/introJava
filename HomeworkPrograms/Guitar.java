package Homework;
/* File: Guitar.java
 * Author: Zachary Finnegan
 * Date: November 18, 2018
 * Purpose: Create a Guitar class that has fields for number of strings,
 * guitar length, guitar manufacturer and color. Then create getter methods
 * for all fields and a playGuitar method that creates a series of notes
 * and durations.
 */

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Guitar {
    // Private class fields
	private int numStrings = 6;
    private double guitarLength = 28.2;
    private String guitarManufacturer = "Gibson";
    private Color guitarColor = Color.red;
    static Map<Color, String> colorMap = new HashMap<Color, String>();
    
    // Default constructor
    public Guitar() {   	
    }//end constructor
    
    //Argument based constructor
    public Guitar(int stringNum, double gLength, String gManu, Color gColor) {
    	numStrings = stringNum;
    	guitarLength = gLength;
    	guitarManufacturer = gManu;
    	guitarColor = gColor;    	
    }//end constructor
    
    //Getter methods for all fields
    public int getNumStrings() {
    	return numStrings;
    }//end getNumStrings
    
    public double getGuitarLength() {
    	return guitarLength;
    }//end getGuitarLength
    
    public String getGuitarManufacturer() {
    	return guitarManufacturer;
    }//end getGuitarManufacturer
    
    public String getGuitarColor(){
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
    	return colorMap.get(guitarColor);
    }//end getGuitarColor
    
    public String playGuitar() {
    	// Creation of arrays to select random notes and durations from
    	// Once arrays are created add values in
    	ArrayList<String> notes = new ArrayList<String>();
    	notes.add("A");
    	notes.add("B");
    	notes.add("C");
    	notes.add("D");
    	notes.add("E");
    	notes.add("F");
    	notes.add("G");
    	ArrayList<String> noteDuration = new ArrayList<String>();
    	noteDuration.add(".25");
    	noteDuration.add(".5");
    	noteDuration.add("1");
    	noteDuration.add("2");
    	noteDuration.add("4");
    
    	//Random generator creation and usage
    	Random rand = new Random();
    	// String variable to hold random note/duration combos
    	String music = "[";
    	// For loop to add 16 random notes and durations to string music
    	for (int i = 0; i <= 15; i++) {
    		String note = notes.get(rand.nextInt(notes.size()));
    		String duration = noteDuration.get(rand.nextInt(noteDuration.size()));
    		if (i <= 14) {
    			music += note + "(" + duration + "), ";
    		} else {
    			music += note + "(" + duration + ")]";
    		}    		
    	}//end for loop
    	return music;
    }// end playGuitar
    
    // toString() method
    public String getGuitarToString() {
    	String numStringString = Integer.toString(numStrings);
    	String guitarLengthString = Double.toString(guitarLength);
    	String guitarColor = getGuitarColor();
    	return ("Number of Strings = " + numStringString + ", Guitar Length = " +
    	        guitarLengthString + ", Guitar Manufacturer = " + guitarManufacturer +
    	        ", Guitar Color = " + guitarColor + ".");
    }//end getGuitarToString
    public static void main(String[] args) {      
    
    }   
}
