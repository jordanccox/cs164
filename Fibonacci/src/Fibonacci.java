// Fibonacci.java
// Author: Cox, Jordan
// Date:   Feb 16, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu



public class Fibonacci {
	public static void main(String[] args) {
		int i;
		int b = 1;
		int a = 2;
		int fibNum = 0;
		int sumEven = 2;;
		
		System.out.print("0 1 1 ");
		for (i = 0; i < 31; i++) {
			/*
			System.out.print(fibNum + " ");
			*/
			fibNum = a + b;
			b = a;
			a = fibNum;
			
			if (fibNum % 2 == 0) {
				sumEven += fibNum;
			}
		}
		
		System.out.println(sumEven);
	}

}
