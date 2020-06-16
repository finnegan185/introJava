/* File: USCrimesClass.java
 * Author: Zachary Finnegan
 * Date: 12/16/2018
 * Purpose: This is the back-end of the USCrimeApp. It parses the data from the recieved Crime.csv file
 * and stores it in a two-dimensional array. The array is used by the rest of the methods to answer the questions
 * in the menu of the USCrimeApp.
 */

package Homework;
import java.io.*;
import java.text.DecimalFormat;


public class USCrimesClass {
	//Array creation to hold .csv file information and field for passed name of stat file
	private String[][] crimeStatsArray = new String[21][20];
	private String crimeFileName = "";
	private DecimalFormat numFormat = new DecimalFormat("#.00");
	
	//method for populating crimestatsarray with .csv file information
	public void createCrimeStatsArray(String crimeFileName) throws FileNotFoundException {
		//useful variables to hold .csv file information per line
		//data separator field, and row and col variable creation
		String line = "";
		String fileSplitBy = ",";
		int row =0;
		int col =0;
		
		//try block for accessing the file received by the USCrimeApp and parsing it into a 2d array
		try (BufferedReader inputStream = new BufferedReader(new FileReader(crimeFileName))){
			while((line = inputStream.readLine()) != null) {
				String[] crimeStatLine = line.split(fileSplitBy);
				col =0;
				for(String i : crimeStatLine) {
					crimeStatsArray[row][col] = i;
					col++;
				}
				row++;
			}

		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
	//Beginning of the methods for answering menu items.
	//Yearly population growth method
	public String getPopulationGrowth() {
		String populationGrowth = "";
		int year = Integer.parseInt(crimeStatsArray[1][0]);
		for(int i = 1; i <= 19; i++) {
			double lastYrPop = Double.parseDouble(crimeStatsArray[i][1]);
			double currentYrPop = Double.parseDouble(crimeStatsArray[(i+1)][1]);
			double yearlyGrowth = ((currentYrPop - lastYrPop)/lastYrPop)*100;

			populationGrowth += "From " + year + " to " + (year+1) + " the population grew by " +
			numFormat.format(yearlyGrowth) + "%.\n";
			year++;
		}
		return populationGrowth;
	}
	
	//Beginning of methods used for determining min/max rates/years for various crimes
	public String getMaxMurderYear() {
		String maxMurderInfo = "";
		String maxMurderYear = "";
		double maxMurderNum = 0.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][5]);
			if (temp > maxMurderNum) {
				maxMurderNum = temp;
				maxMurderYear = crimeStatsArray[m][0];
			}
		}
		maxMurderInfo = maxMurderYear + " had the highest murder rate of " + maxMurderNum + 
				" murders per 100,000 people.\n";
		return maxMurderInfo;
	}
	
	public String getMinMurderYear() {
		String minMurderInfo = "";
		String minMurderYear = "";
		double minMurderNum = 1000.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][5]);
			if (temp < minMurderNum) {
				minMurderNum = temp;
				minMurderYear = crimeStatsArray[m][0];
			}
		}
		minMurderInfo = minMurderYear + " had the lowest murder rate of " + minMurderNum + 
				" murders per 100,000 people.\n";
		return minMurderInfo;
	}
	
	public String getMaxRobberyYear() {
		String maxRobberyInfo = "";
		String maxRobberyYear = "";
		double maxRobberyNum = 0.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][9]);
			if (temp > maxRobberyNum) {
				maxRobberyNum = temp;
				maxRobberyYear = crimeStatsArray[m][0];
			}
		}
		maxRobberyInfo = maxRobberyYear + " had the highest robbery rate of " + maxRobberyNum + 
				" robberies per 100,000 people.\n";
		return maxRobberyInfo;
	}
	
	public String getMinRobberyYear() {
		String minRobberyInfo = "";
		String minRobberyYear = "";
		double minRobberyNum = 100000.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][9]);
			if (temp < minRobberyNum) {
				minRobberyNum = temp;
				minRobberyYear = crimeStatsArray[m][0];
			}
		}
		minRobberyInfo = minRobberyYear + " had the lowest robbery rate of " + minRobberyNum + 
				" robberies per 100,000 people.\n";
		return minRobberyInfo;
	}
	
	public String getMaxViolentCrimeYear() {
		String maxViolentCrimeInfo = "";
		String maxViolentCrimeYear = "";
		double maxViolentCrimeNum = 0.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][3]);
			if (temp > maxViolentCrimeNum) {
				maxViolentCrimeNum = temp;
				maxViolentCrimeYear = crimeStatsArray[m][0];
			}
		}
		maxViolentCrimeInfo = maxViolentCrimeYear + " had the highest violent crime rate of " + 
				maxViolentCrimeNum + " violent crimes per 100,000 people.\n";
		return maxViolentCrimeInfo;
	}
	
	public String getMinViolentCrimeYear() {
		String minViolentCrimeInfo = "";
		String minViolentCrimeYear = "";
		double minViolentCrimeNum = 100000.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][3]);
			if (temp < minViolentCrimeNum) {
				minViolentCrimeNum = temp;
				minViolentCrimeYear = crimeStatsArray[m][0];
			}
		}
		minViolentCrimeInfo = minViolentCrimeYear + " had the lowest violent crime rate of " + 
		minViolentCrimeNum + " violent crimes per 100,000 people.\n";
		return minViolentCrimeInfo;
	}//End of methods that answer min/max questions
	
	//below are methods for finding the rate of crime reduction between peak year
	//for that type of crime and 2013
	public String getMurderReduction() {
		double murder2013Num = Double.parseDouble(crimeStatsArray[19][5]);
		String murderReductionInfo = "";
		String maxMurderYear = "";
		double maxMurderNum = 0.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][5]);
			if (temp > maxMurderNum) {
				maxMurderNum = temp;
				maxMurderYear = crimeStatsArray[m][0];
			}
			
		}
		double murderReducPerc = maxMurderNum - murder2013Num;
		murderReductionInfo = "Murder was reduced by " + numFormat.format(murderReducPerc) +
				" per 100,000 people between the peak in " + maxMurderYear +
				" of " + maxMurderNum + " and 2013 with a rate of " + murder2013Num + ".\n";
		return murderReductionInfo;	
	}
	
	public String getRobberyReduction() {
		double robbery2013Num = Double.parseDouble(crimeStatsArray[19][9]);
		String robberyReductionInfo = "";
		String maxRobberyYear = "";
		double maxRobberyNum = 0.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][9]);
			if (temp > maxRobberyNum) {
				maxRobberyNum = temp;
				maxRobberyYear = crimeStatsArray[m][0];
			}
			
		}
		double robberyReducPerc = maxRobberyNum - robbery2013Num;
		robberyReductionInfo = "Robbery was reduced by " + numFormat.format(robberyReducPerc) +
				" per 100,000 people between the peak in " + maxRobberyYear +
				" of " + maxRobberyNum + " and 2013 with a rate of " + robbery2013Num + ".\n";
		return robberyReductionInfo;	
	}
	
	public String getViolentCrimeReduction() {
		double violentCrime2013Num = Double.parseDouble(crimeStatsArray[19][3]);
		String violentCrimeReductionInfo = "";
		String maxViolentCrimeYear = "";
		double maxViolentCrimeNum = 0.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][3]);
			if (temp > maxViolentCrimeNum) {
				maxViolentCrimeNum = temp;
				maxViolentCrimeYear = crimeStatsArray[m][0];
			}
			
		}
		double violCriReducPerc = maxViolentCrimeNum - violentCrime2013Num;
		violentCrimeReductionInfo = "Violent crime was reduced by " + numFormat.format(violCriReducPerc) +
				" per 100,000 people between the peak in " + maxViolentCrimeYear +
				" of " + maxViolentCrimeNum + " and 2013 with a rate of " + violentCrime2013Num + ".\n";
		return violentCrimeReductionInfo;	
	}//end of crime reduction questions
	
	//Class constructor 
	public USCrimesClass() {
		
	}

	//getter and setter for the crimeFileName field. Not sure how much utility this would get
	public String getCrimeFileName() {
		return crimeFileName;
	}

	public void setCrimeFileName(String crimeFileName) {
		this.crimeFileName = crimeFileName;
	}

	public static void main(String[] args){

		
	}

}
