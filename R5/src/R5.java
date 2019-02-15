// R5.java
// Author: Cox, Jordan
// Date:   Feb 5, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scnr = new Scanner(System.in);
		
		// Declare variables
		boolean boolean0 = true;
		boolean boolean1 = false;
		boolean equals;
		boolean notEquals;
		boolean greaterThan;
		boolean lessThan;
		
		// Print boolean variables
		System.out.println("boolean0 is " + boolean0 + ".");
		System.out.println("boolean1 is " + boolean1 + ".");
		
		// Assign comparison operators
		equals = (11 == 33);
		notEquals = (22 != 44);
		greaterThan = (15 > 25);
		lessThan = (-11 < 13);
		
		// Print comparison operators
		System.out.println("(11 == 33) is " + equals + ".");
		System.out.println("(22 != 44) is " + notEquals + ".");
		System.out.println("(15 > 25) is " + greaterThan + ".");
		System.out.println("(-11 < 13) is " + lessThan + ".");
		
		// Declare and scanner variables
		int integer0;
		int integer1;
		
		// Get first input from scanner
		System.out.print("Enter first integer: ");
		integer0 = scnr.nextInt();
		
		//Get second input from scanner
		System.out.print("Enter second integer: ");
		integer1 = scnr.nextInt();
		
		// Conditional statements
		if (integer0 > integer1) {
			System.out.println("First integer is larger than the second.");
		}
		else if (integer1 > integer0) {
			System.out.println("Second integer is larger than the first.");
		}
		else {
			System.out.println("Both integers are equal.");
		}

		// Switch statements
		String myString;
		
		System.out.print("Enter a state: ");
		myString = scnr.next();
		
		switch (myString) {
		case "Florida":
		case "Alabama":
			System.out.println("Southern State");
			break;
		case "Colorado":
		case "Utah":
			System.out.println("Western State");
			break;
		case "Michigan":
		case "Wisconsin":
			System.out.println("Northern State");
			break;
		case "Delaware":
		case "Maine":
			System.out.println("Eastern State");
			break;
		default:
			System.out.println("Not sure where that is, must be in the Midwest!");
			break;
		}
		
		// Close scanner
		scnr.close();
	}

}
