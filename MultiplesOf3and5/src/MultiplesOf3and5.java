import java.util.Arrays;

// MultiplesOf3and5.java
// Author: Cox, Jordan
// Date:   Feb 15, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class MultiplesOf3and5 {

	public static void main(String[] args) {
		int[] r = new int[999];
		Arrays.setAll(r, i -> i + 1);
	
		int i;
		int counter = 0;
		
		for (i = 0; i <  r.length; i++) {
			if ((r[i] % 3 == 0) || (r[i] % 5 == 0)) {
				
				counter += r[i];
			}
		}
		
		
		System.out.println(counter);
		

	}

}
