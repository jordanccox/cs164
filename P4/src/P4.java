// P4.java
// Author: Cox, Jordan
// Date:   Feb 13, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// Create scanner	
		Scanner scnr = new Scanner(System.in);
		
		//Declare variables
		double grossSalary;
		double interestIncome;
		double capitalGains;
		int numExemptions;
		double totalIncome;
		double adjIncome;
		double fedTax;
		double stateTax;
		
		//Prompt user to enter grossSalary, numExemptions, interestIncome, capitalGains
		System.out.print("Salary: ");
		grossSalary = scnr.nextDouble();
		
		System.out.print("Exemptions: ");
		numExemptions = scnr.nextInt();
		
		System.out.print("Interest: ");
		interestIncome = scnr.nextDouble();
		
		System.out.print("Gains: ");
		capitalGains = scnr.nextDouble();
		
		scnr.close();
		
		//Calculate totalIncome = Gross Salary + Interest Income + Capital Gains - $5000.00
		totalIncome = (grossSalary + interestIncome + capitalGains) - 5000;
		
		//Calculate adjIncome = Total Income - (Number of Exemptions * 1500.00) 
		if (numExemptions > 6 ) numExemptions = 6;
		adjIncome = totalIncome - (numExemptions * 1500);
		
		//Calculate fedTax
		if ((adjIncome >= 0) && (adjIncome < 20000)) {
			fedTax = 0;
		}
		else if ((adjIncome >= 20000) && (adjIncome < 35000)) {
			fedTax = 0.13 * (35000 - 20000);
		}
		else if ((adjIncome >= 35000) && (adjIncome < 50000)) {
			fedTax = (0.13 * (35000 - 20000)) + (0.23 * (50000 - 35000));
		}
		else {
			fedTax = (0.13 * (35000 - 20000)) + (0.23 * (50000 - 35000)) + (0.28 * (adjIncome - 50000));
		}
		
		//Calculate stateTax
		stateTax = adjIncome * 0.065;
		
		//Print total income, adjusted income, total tax, and state tax
		System.out.printf("Total Income: $%.2f\n", + (float)totalIncome);
		System.out.printf("Adjusted Income: $%.2f\n", + (float)adjIncome);
		System.out.printf("Total Tax: $%.2f\n", + (float)fedTax);
		System.out.printf("State Tax: $%.2f\n", + (float)stateTax);
		
		
	}

}
