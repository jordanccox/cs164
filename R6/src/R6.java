// R6.java
// Author: Cox, Jordan
// Date:   Feb 12, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class R6 {

	public static void main(String[] args) {
		// Declare variables
		String myString0 = "Java";
		String myString1 = "Programming";
		String myString2 = "Language";
		
		//Print concatenation
		System.out.println(myString0 + " " + "is a " + myString1 + " " + myString2);
		
		//Print sum of strings
		System.out.println(myString0.length() + myString1.length() + myString2.length());
		
		//Print the 2nd, 4th, and 7th character of myString1
		System.out.println(myString1.charAt(2) + ", " + myString1.charAt(4) + ", " + myString1.charAt(7));
		
		//Print the index of 'a' in myString0 
		System.out.println(myString0.indexOf('a'));
		
		//Print myString2 converted to upper case
		System.out.println(myString2.toUpperCase());
		
		//Print the 3rd through 8th character of myString1
		System.out.println(myString1.substring(3, 9));
		
		//Declare new strings
		String myString3 = new String("Whatever!");
		String myString4 = new String("Whatever!");
		
		//Compare new strings
		System.out.println(myString3 == myString4);
		System.out.println(myString3.equals(myString4));
		
		//Char variables
		char c0 = '^';
		char c1 = 'G';
		char c2 = '7';
		
		System.out.println(c0 + "; " + c1 + "; " + c2);
		System.out.print((int)c0 + ", " + (int)c1 + ", " + (int)c2);
	}

}
