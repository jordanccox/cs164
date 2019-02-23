// R8.java
// Author: Cox, Jordan
// Date:   Feb 21, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class R8 {

	public static void reverseString(String s) {
	    int i;
	    
	    for (i = s.length() - 1; i >= 0; i--) {
	    	System.out.print(s.charAt(i));
	    }
	    
	    System.out.println();
	}

	public static void printAscii(char start, char end) {
	    char i;
		for (i = start; i <= end; i++) {
			System.out.println((int)i + ": " + i);
		}
	}

	public static double raiseToPower(double number, int exponent) {
	    int i = 1;
	    double storeValue = number;
	    
		while (i < exponent) {
			storeValue = storeValue * number;
			i++;
		}
		return storeValue;
	}
	
	public static void main(String[] args) {
		// Test reverseString
	    String forward = "Java Programming rules!";
	    System.out.print("Forward string: ");
	    System.out.println(forward);
	    System.out.print("Reverse string: ");
	    reverseString(forward);
	        
	    // Test printAscii
	    System.out.println("ASCII Table");
	    printAscii('!', '9');
	        
	    // Test raiseToPower
	    System.out.printf("3.0 to the 5 = %.3f\n", raiseToPower(3.0, 5));
	    System.out.printf("2.5 to the 2 = %.3f\n", raiseToPower(2.5, 2));

	}

}
