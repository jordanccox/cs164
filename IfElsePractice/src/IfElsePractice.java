// IfElsePractice.java
// Author: Cox, Jordan
// Date:   Feb 6, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class IfElsePractice {

	public static void main(String[] args) {
		int myInteger = -1;
		if (myInteger++ > 0) {
			myInteger = myInteger + 2;
			System.out.println(myInteger);
		}
		else {
			System.out.println(myInteger);
		}

		int myInt = 1;
		myInt = myInt + 1;
		System.out.println(myInt);
	}

}
