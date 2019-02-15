// P3.java
// Author: Cox, Jordan
// Date:   Feb 4, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

import java.util.Scanner;

public class P3 {

    public static String evaluate(String expression) {

        // Print expression
        System.out.println(expression);

        // Declare variables for operands, operator, result, and return value
        String returnString = "";
        String operator;
        double operand0;
        double operand1;
        double result;
       
        // Create Scanner object to parse expression
        Scanner scnr = new Scanner(expression);

        // Use Scanner to read operands and operator
        if (scnr.hasNextDouble()) {
        	operand0 = scnr.nextDouble();
        	 if (scnr.hasNext()) {
             	operator = scnr.next();
             	switch (operator) {
             	case "+":
             		if (scnr.hasNextDouble()) {
             			operand1 = scnr.nextDouble();
             			result = operand0 + operand1;
             			returnString = Double.toString(result);
             		}
             		else {
             			returnString = "Invalid Operand!";
             		}
             		break;
             	case "-":
             		if (scnr.hasNextDouble()) {
             			operand1 = scnr.nextDouble();
             			result = operand0 - operand1;
             			returnString = Double.toString(result);
             		}
             		else {
             			returnString = "Invalid Operand!";
             		}
             		break;
             	case "*":
             		if (scnr.hasNextDouble()) {
             			operand1 = scnr.nextDouble();
             			result = operand0 * operand1;
             			returnString = Double.toString(result);
             		}
             		else {
             			returnString = "Invalid Operand!";
             		}
             		break;
             	case "/":
             		if (scnr.hasNextDouble()) {
             			operand1 = scnr.nextDouble();
             			result = operand0 / operand1;
             			returnString = Double.toString(result);
             		}
             		else {
             			returnString = "Invalid Operand!";
             		}
             		break;
             	case "%":
             		if (scnr.hasNextDouble()) {
             			operand1 = scnr.nextDouble();
             			result = operand0 % operand1;
             			returnString = Double.toString(result);
             		}
             		else {
             			returnString = "Invalid Operand!";
             		}
             		break;
             	case "^":
             		if (scnr.hasNextDouble()) {
             			operand1 = scnr.nextDouble();
             			result = Math.pow(operand0, operand1);
             			returnString = Double.toString(result);
             		}
             		else {
             			returnString = "Invalid Operand!";
             		}
             		break;
             	default:
             		System.out.println("Invalid Operator!");
             		returnString = "Invalid Operator!";
             		break;
             	}
        	 }
        }
        else {
        	System.out.println("Invalid Operand!");
        	returnString = "Invalid Operand!";
        }
        
        scnr.close();
        
        // Compute a numerical result for the expression
        
        // Convert numerical result to string
        
        // Return result
        return returnString;
        
    }
}