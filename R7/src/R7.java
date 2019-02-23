// R7.java
// Author: Cox, Jordan
// Date:   Feb 20, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class R7 {

    public static void main(String[] args) {

        // Declare variables
        int int0=0, int1=0;
        double real0=0.0, real1=0.0;
        char char0=' ', char1=' ', char2=' ';
        String string0="", string1="", string2="";

        try {

            // Open input stream
            Scanner scan = new Scanner(new File("data.txt"));

            // Read contents
            string0 = scan.nextLine();
            string1 = scan.nextLine();
            string2 = scan.nextLine();
            char0 = scan.next().charAt(0);
            char1 = scan.next().charAt(0);
            char2 = scan.next().charAt(0);
            int0 = scan.nextInt();
            int1 = scan.nextInt();
            real0 = scan.nextDouble();
            real1 = scan.nextDouble();

            // Close input stream
            scan.close();

        } catch (IOException e) {
            System.out.println("Cannot read file: data.txt");
            System.exit(0);
        }
        
        System.out.println((int0 * 17) + (int1 * 7));
        System.out.println((real1 - real0) / 4.321);
        System.out.printf("%.6f\n", Math.pow(real1,5));
        System.out.println(string0.charAt(3) + ", " + string1.charAt(2) + ", " + string2.charAt(string2.length() - 1));
        System.out.println(string1.length() + string1.charAt(0));
        System.out.println((int)char0 * (int)char1 * (int)char2);
        System.out.println(string2 == "Hello World!");
        
        if (Character.isUpperCase(string1.charAt(0))) {
        	System.out.println("Starts with uppercase letter.");
        }
        else if (Character.isLowerCase(string1.charAt(0))) {
        	System.out.println("Starts with lowercase letter.");
        }
        else {
        	System.out.println("Does not start with a letter.");
        }
        
        switch (char1) {
        case '$':
        case '@':
        case '#':
        	System.out.print("Special Character");
        	break;
        case '2':
        case '4':
        case '6':
        case '8':
        	System.out.print("Even Digit");
        	break;
        case '1':
        case '3':
        case '5':
        case '7':
        case '9':
        	System.out.print("Odd Digit");
        	break;
        case 'a':
        case 'i':
        case 'e':
        case 'o':
        case 'u':
        	System.out.print("Vowel Letter");
        	break;
        default:
        	System.out.print("Unknown character");
        	break;
        }
    } 
}
