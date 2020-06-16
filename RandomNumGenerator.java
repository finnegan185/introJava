package discussions;

public class RandomNumGenerator {
	public static void main(String[] args) {
		//Create local variables to hold CommandLine Arguments
		int numberOfNumbers = Integer.parseInt(args[0]);
		int numberRange = Integer.parseInt(args[1]);
		
		//for loop to print out X number of random numbers of range Y
		for (int i = 0; i <= numberOfNumbers; i++) {
			int randomNum = (int)(Math.random() * numberRange);
			System.out.println("Random number " + i + " is " + randomNum + ".");
		}
		
		//Print statement wrapping up program
		System.out.println("User asked for " + numberOfNumbers + " random numbers between 0 and " + numberRange +
				". \nAll requested numbers have been generated. Goodbye.");
	}

}
