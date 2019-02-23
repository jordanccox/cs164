// PrimeFactor.java
// Author: Cox, Jordan
// Date:   Feb 20, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu


public class PrimeFactor {
	/*
	public static boolean isPrime(long number) {
	    for(long i = 2; i <= number / 2; i++)
	        if(number % i == 0)
	            return false;
	    return true;
	}
	*/
	public static void main(String[] args)  {
		long i;
		long largestPrime = 0;
		// long largestFactor;
		long num = 6008514751439L ;
		/*
		for (i = 3; i <= num; i = i + 2) {
			if (num % i == 0) {
				
				System.out.print(i + " ");
				
				largestFactor = i;
				if (isPrime(largestFactor) == true) {
					largestPrime = i;
				}
			}
		}
		*/
		for (i = 2; i <= num; i++) {
			while (num % i == 0) {
				num /= i;
				largestPrime = i;
			}
		}
		
		System.out.println(largestPrime);

	}

}
