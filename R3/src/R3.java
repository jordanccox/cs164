// R3 Assignment
// Author: Cox, Jordan
// Date:   Jan 30, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class R3 {

	public static void main(String[] args) {
		
		// date type variableName = value;
		
		char c0 = '$';
		char c1 = 'W';
		
		byte b0 = 15;
		byte b1 = 4;
		
		short s0 = 5577;
		short s1 = 1234;
		
		int i0 = 12345;
		int i1 = -99999;
		
		// For longs l is required at the end of the line. For floats f is required at the end of a line.
		
		long l0 = 8000000000l;
		long l1 = -7000000000l;
		
		float f0 = 1.2345f;
		float f1 = 66.7788f;
		
		double d0 = 0.00001;
		double d1 = 83475.29837;
		
		System.out.println(b0 + b1);
		System.out.println((b0 + b1) / 4);
		System.out.println((b0 + b1) / 4.0);
		System.out.println(s0 / 1000);
		System.out.println(s0 / 1000.0);
		System.out.println(s1 % 100);
		System.out.println((i0 - 2345) * 10);
		System.out.println(i0 - 2345 * 10);
		System.out.println(l1 + i1);
		System.out.println((f0 + f1) / (d0 * d1));
		System.out.println(0.1 + 0.2 - 0.3);
		System.out.println(6 % 4 + 12 - 3 * (8 + 3) / 2);
		
		System.out.println(c0 + "," + c1);
		System.out.println("5577 + 1234 = " + s0 + s1);
		
		// printf is useful for printing a number to a certain number of decimal places
		// %.5f\n prints to five decimal places. f for floating point
		// % is syntax
		// \n is new line
		
		System.out.printf("5577 + 1234 = %d\n", s0 + s1);
		System.out.printf("0.00001 + 83475.29837 = %.2f\n", d0 + d1);
		System.out.printf("0.00001 + 83475.29837 = %.5f\n", d0 + d1);

	}

}
