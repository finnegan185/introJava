package Homework;


public class GuitarTwo {
  public static void main(String[] args) {
	  Guitar guitarOne = new Guitar();
	  System.out.println("getGuitarToString(): " + guitarOne.getGuitarToString());
	  System.out.println("getNumStrings(): " + guitarOne.getNumStrings());
	  System.out.println("getGuitarLength(): " + guitarOne.getGuitarLength());
	  System.out.println("getGuitarManufacturer(): " + guitarOne.getGuitarManufacturer());
	  System.out.println("Color: " + guitarOne.getGuitarColor());
	  System.out.println("What to play: " + guitarOne.playGuitar());
  }

}
