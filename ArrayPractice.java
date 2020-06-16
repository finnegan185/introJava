package discussions;
/* File: ArrayPractice.java
 * Author: Zachary Finnegan
 * Date: November 22 2018
 * Purpose: Create an int array of a specific length and then use .length for discussion
 */
//import java array library
import java.util.Arrays;

public class ArrayPractice {
	public static void main(String[] args) {
		//create the array
		int[] intArray = new int[5];
		// Add values to the array
		for(int i = 0; i <= intArray.length - 1; i++) {
			intArray[i] = i;
		}
		//create local variable to hold array length using .length notation
		int intArrayLength = intArray.length;
		//print out array length and array values
		System.out.println("Array1 length = " + intArrayLength);
		System.out.println("Array1 contents = " + Arrays.toString(intArray));
		
		//create array and add values at the same time
		// and repeat above steps
		int[] intArray2 = {1,4,6,8,199,868,422};
		int intArray2Length = intArray2.length;
		System.out.println("Array2 length = " + intArray2Length);
		System.out.println("Array2 contents = " + Arrays.toString(intArray2));	
		
		int sum = 0;
		for (int i=0; i < intArray2.length; i++) {
			sum += intArray2[i];
		}
		int arrayLength = intArray2.length;
		double average = sum/arrayLength;
		System.out.println("average: " + average);
	}

}
