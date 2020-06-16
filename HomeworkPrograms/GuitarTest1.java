package Homework;
/* File: GuitarTest.java
 * Author: Zachary Finnegan
 * Date: November 18, 2018
 * Purpose: Create three test objects of the Guitar class and
 * print out all getter methods
 */

import java.awt.Color;

public class GuitarTest1 {
  public static void main(String[] args) {
	  // Guitar one constructor using custom arguments
	  Guitar guitarOne = new Guitar(4, 28.1, "Goober", Color.BLACK);
	  System.out.println("Guitar One\n");
	  //Guitar one getter method calls
	 
	  System.out.println("getGuitarToString(): " + guitarOne.getGuitarToString());
	  System.out.println("getNumStrings(): " + guitarOne.getNumStrings());
	  System.out.println("getGuitarLength(): " + guitarOne.getGuitarLength());
	  System.out.println("getGuitarManufacturer(): " + guitarOne.getGuitarManufacturer());
	  System.out.println("getGuitarColor(): " + guitarOne.getGuitarColor());
	  System.out.println("playGuitar(): " + guitarOne.playGuitar() + "\n\n");
	  
	  //Guitar two constructor using default no-argument constructor
	  Guitar guitarTwo = new Guitar();
	  System.out.println("Guitar Two\n");
	  //Guitar two getter method calls
	  System.out.println("getGuitarToString(): " + guitarTwo.getGuitarToString());
	  System.out.println("getNumStrings(): " + guitarTwo.getNumStrings());
	  System.out.println("getGuitarLength(): " + guitarTwo.getGuitarLength());
	  System.out.println("getGuitarManufacturer(): " + guitarTwo.getGuitarManufacturer());
	  System.out.println("getGuitarColor(): " + guitarTwo.getGuitarColor());
	  System.out.println("playGuitar(): " + guitarTwo.playGuitar() + "\n\n");
  
	  //Guitar three constructor using custom arguments
	  Guitar guitarThree = new Guitar(3, 10.4, "Gibson", Color.MAGENTA);
	  System.out.println("Guitar Three\n");
	  //Guitar three getter method calls
	  System.out.println("getGuitarToString(): " + guitarThree.getGuitarToString());	    
      System.out.println("getNumStrings(): " + guitarThree.getNumStrings());
	  System.out.println("getGuitarLength(): " + guitarThree.getGuitarLength());
      System.out.println("getGuitarManufacturer(): " + guitarThree.getGuitarManufacturer());
	  System.out.println("getGuitarColor(): " + guitarThree.getGuitarColor());
	  System.out.println("playGuitar(): " + guitarThree.playGuitar());
  }
}
