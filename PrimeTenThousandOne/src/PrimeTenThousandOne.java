// PrimeTenThousandOne.java
// Author: Cox, Jordan
// Date:   Feb 23, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class PrimeTenThousandOne {
	
	public static boolean isPrime(int number) {
	    for(int i = 2; i <= number / 2; i++)
	        if(number % i == 0)
	            return false;
	    return true;
	}

	public static int primeAtPosition(int number) {
		int i = 2;
		int primeAtPosition = 0;
		int counter = 0;
		
		while (true) {
			if (isPrime(i)) {
				counter++;
				primeAtPosition = i;
			} 
			if (counter == number) {
				break;
			}
			i++;
		}
		
		return primeAtPosition;
		
	}
	
	public static void main(String[] args) {
		System.out.println(primeAtPosition(10001));

	}

}
