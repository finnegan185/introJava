package Homework;

public class quiz2DArray {
  public static void main(String[] args) {
	  int[][][] arrayFun = new int [5][5][5];
	  for (int array = 0; array < arrayFun.length; array++) {
		  for (int row = 0; row < arrayFun[array].length; row++) {
			  for (int col = 0; col < arrayFun[row].length; col++)
			  arrayFun[array][row][col] = (int)(Math.random() * 1000);
		  }
	  }
	  for (int array = 0; array < arrayFun.length; array++) {
		  for (int row = 0; row < arrayFun[array].length; row++) {
			  for (int col = 0; col < arrayFun[row].length; col++) {
				  System.out.format("%4d", arrayFun[array][row][col]);
			  }
			  System.out.println();
		  }
		  System.out.println();
	  }
  }
}
