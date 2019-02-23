// PNum.java
// Author: Cox, Jordan
// Date:   Feb 21, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class PNum {

	public static boolean isPalindrome(int number) {
		String sNumber = Integer.toString(number);
	    String reverse = "";
	    for(int i = sNumber.length() - 1; i >= 0; i--) {
	    	reverse += sNumber.charAt(i);
	    }
	    if (reverse.equals(sNumber)) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	
	public static void main(String[] args) {
		/*
		int a;
		int b;
		int i;
		int product = 100;
		String maxPalindrome = "";
		String reverse = "";
		String sProduct = Integer.toString(product);
		
		for (i = sProduct.length() - 1; i >= 0; i--) {
			reverse += sProduct.charAt(i);
		System.out.println(reverse);
		
		int i = 9009;
		System.out.print(isPalindrome(i));
		*/
		
		int i;
		int j;
		int product = 0;
		int maxPal = 0;
		
		for (i = 999; i >= 100; i--) {
			for (j = 999; j >= 100; j--) {
				product = i * j;
				if ((isPalindrome(product)) && (product > maxPal)) {
						 maxPal = product;
					}
				
			}
		}
		
		System.out.println(maxPal);
		
	}

}
