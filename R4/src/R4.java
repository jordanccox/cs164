// R4.java
// Author: Cox, Jordan
// Date:   Feb 1, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {
		
		/*
		// Operator precedence, integer math
	    System.out.println(2 - 23 % 10 + 3 * 12 - 20);
	    // Prints 15
	    
	    // Operator precedence, floating-point math
	    System.out.println(2.4 + 23.1 - 10.0 * 3.1 - 12.5 / 6.25);
	    // prints -7.5
	    
	    // Operator precedence, mixed math
	    System.out.println(65 % 15 + 3.5 * (5 / 2));
	    // Prints 12.0
	     */
		
		int a;
		int b;
		int c;
		
		double positiveRoot;
		double negativeRoot;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter coefficient A: ");
		a = input.nextInt();
		
		System.out.print("Enter coefficient B: ");
		b = input.nextInt();
		
		System.out.print("Enter coefficient C: ");
		c = input.nextInt();
		
		System.out.print(a + "x^2 + " + b + "x + " + c);
		
		input.close();
		
		System.out.println();
		
		positiveRoot = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		System.out.printf("Positive Root: %.1f\n", positiveRoot);
		
		negativeRoot = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		System.out.printf("Negative Root: %.1f\n", negativeRoot);


	}

}