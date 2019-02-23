// SumSquareDifference.java
// Author: Cox, Jordan
// Date:   Feb 23, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class SumSquareDifference {

	public static int sumSquare(int start, int end) {
		int i;
		int sumOfSquares = 0;
		int squareOfSums = 0;
		int difference;
		
		for (i = start; i <= end; i++) {
			sumOfSquares += Math.pow(i, 2);
			squareOfSums += i;
		}
		
		squareOfSums = (int)Math.pow(squareOfSums, 2);
		difference = squareOfSums - sumOfSquares;
		
		return difference;
	}
	
	public static void main(String[] args) {
		System.out.println(sumSquare(1, 100));

	}

}
