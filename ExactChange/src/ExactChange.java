// ExactChange.java
// Author: Cox, Jordan
// Date:   Feb 3, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

import java.util.Scanner;

public class ExactChange {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter amount of money: ");
		double moneyAmount = scnr.nextDouble();
		moneyAmount = moneyAmount * 100;
		
		scnr.close();
		
		// Get number of quarters
		int changeQuarters = (int)moneyAmount / 25;
		int remaining = (int)moneyAmount % 25;
		
		// Get number of dimes
		int changeDimes = remaining / 10;
		remaining = remaining % 10;
		
		// Get number of nickles
		int changeNickles = remaining / 5;
		remaining = remaining % 5;
		
		// Get number of pennies
		int changePennies = remaining;
		
		System.out.println("Quarters: " + changeQuarters);
		System.out.println("Dimes: " + changeDimes);
		System.out.println("Nickles: " + changeNickles);
		System.out.println("Pennies: " + changePennies);
		
		

	}

}
