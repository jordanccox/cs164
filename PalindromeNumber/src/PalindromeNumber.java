// PalindromeNumber.java
// Author: Cox, Jordan
// Date:   Feb 20, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class PalindromeNumber {

	public static void main(String[] args) {
		// int num = 9009;
		int a;
		int b;
		int i;
		int product = 0;
		String maxPalindrome = "";
		// String sInt = Integer.toString(num);
		String reverse = "";
		
		for (a = 100; a <= 105; a++) {
			for (b = 100; b <= 105; b++) {
				product = a * b;
			}
		
		}
		
		String sProduct = Integer.toString(product);
		for (i = sProduct.length() - 1; i >= 0; i--) {
			reverse += sProduct.charAt(i);
		System.out.println(reverse);

	}

}
}
