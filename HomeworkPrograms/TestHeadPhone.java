/* File: TestHeadPhone.java
 * Author: Zachary Finnegan
 * Date: 12/02/2018
 * Purpose: Create 3 test instances of the headphone class and change and get values of the instances
 */
package Homework;

import java.awt.Color;

public class TestHeadPhone {
  public static void main(String[] args) {
	  //Headphone test construction
	  HeadPhone testCase1 = new HeadPhone();
	  HeadPhone testCase2 = new HeadPhone();
	  HeadPhone testCase3 = new HeadPhone();
	  
	  //using getters for TestCase1 which will stay default
	  System.out.println("TestCase1 field values.");
	  System.out.println("Volume: " + testCase1.getVolume());
	  System.out.println("Pluggedin: " + testCase1.getPluggedIn());
	  System.out.println("Manufacturer: " + testCase1.getManufacturer());
	  System.out.println("Color: " + testCase1.getHeadPhoneColor());
	  System.out.println("Model: " + testCase1.getHeadPhoneModel());
	  System.out.println("----------------------------------");
	  
	  //Using setters for testcase2
	  testCase2.changeVolume(3);
	  testCase2.setPluggedIn(true);
	  testCase2.setManufacterer("Sony");
	  testCase2.setHeadPhoneColor(Color.red);
	  testCase2.setHeadPhoneModel("ATH54");
	  
	  //Using getters for testcase2
	  System.out.println("TestCase2 field values.");
	  System.out.println("Volume: " + testCase2.getVolume());
	  System.out.println("Pluggedin: " + testCase2.getPluggedIn());
	  System.out.println("Manufacturer: " + testCase2.getManufacturer());
	  System.out.println("Color: " + testCase2.getHeadPhoneColor());
	  System.out.println("Model: " + testCase2.getHeadPhoneModel());
	  System.out.println("----------------------------------");
	  
	  //Using setters for testCase2
	  testCase3.changeVolume(5);
	  testCase3.setPluggedIn(false);
	  testCase3.setManufacterer("Seinhiesser");
	  testCase3.setHeadPhoneColor(Color.gray);
	  testCase3.setHeadPhoneModel("CrackerJack");
	  
	  //Using getters for testCase3
	  System.out.println("TestCase1 field values.");
	  System.out.println("Volume: " + testCase3.getVolume());
	  System.out.println("Pluggedin: " + testCase3.getPluggedIn());
	  System.out.println("Manufacturer: " + testCase3.getManufacturer());
	  System.out.println("Color: " + testCase3.getHeadPhoneColor());
	  System.out.println("Model: " + testCase3.getHeadPhoneModel());

  }
}
