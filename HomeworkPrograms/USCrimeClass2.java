package Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class USCrimeClass2 {
	private static String[][] crimeStatsArray = new String[21][20];
	private String crimeFileName = "";
	
	public void createCrimeStatsArray(String crimeFileName) {
		
	}
	
	public String getPopulationGrowth() {
		String populationGrowth = "";
		int year = Integer.parseInt(crimeStatsArray[1][0]);
		DecimalFormat numFormat = new DecimalFormat("#.00");
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
				" murders per 100,000 people.";
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
				" murders per 100,000 people.";
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
				" robberies per 100,000 people.";
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
				" robberies per 100,000 people.";
		return minRobberyInfo;
	}
	
	public String getViolentCrimeYear() {
		String maxViolentCrimeInfo = "";
		String maxViolentCrimeYear = "";
		double maxViolentCrimeNum = 0.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][9]);
			if (temp > maxViolentCrimeNum) {
				maxViolentCrimeNum = temp;
				maxViolentCrimeYear = crimeStatsArray[m][0];
			}
		}
		maxViolentCrimeInfo = maxViolentCrimeYear + " had the highest violent crime rate of " + 
				maxViolentCrimeNum + " violent crimes per 100,000 people.";
		return maxViolentCrimeInfo;
	}
	
	public String getMinViolentCrimeYear() {
		String minViolentCrimeInfo = "";
		String minViolentCrimeYear = "";
		double minViolentCrimeNum = 100000.0;
		for (int m = 1; m <= 19; m++) {
			double temp = Double.parseDouble(crimeStatsArray[m][9]);
			if (temp < minViolentCrimeNum) {
				minViolentCrimeNum = temp;
				minViolentCrimeYear = crimeStatsArray[m][0];
			}
		}
		minViolentCrimeInfo = minViolentCrimeYear + " had the lowest violent crime rate of " + 
		minViolentCrimeNum + " robberies per 100,000 people.";
		return minViolentCrimeInfo;
	}
	
//	public static String getCrimeReductions() {
//		
//	}
	
	public USCrimeClass2(String crimeFileName) {
		this.crimeFileName = crimeFileName;
	}

	public USCrimeClass2() {
		
	}

	public String getCrimeFileName() {
		return crimeFileName;
	}

	public void setCrimeFileName(String crimeFileName) {
		this.crimeFileName = crimeFileName;
	}

	public static void main(String[] args){
		String fileName = args[0];
		String line = "";
		String fileSplitBy = ",";
		int row =0;
		int col =0;
		
		try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName))){
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
		System.out.println(getPopulationGrowth());	
		System.out.println(getMaxMurderYear());
		System.out.println(getMinMurderYear());
		System.out.println(getMaxRobberyYear());
		System.out.println(getMinRobberyYear());
		
	}

}

