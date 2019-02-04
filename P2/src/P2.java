// P2.java
// Author: Cox, Jordan
// Date:   Jan 31, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {

        double alphaAcid;
        double ounces;
        double weight;
        double lovibond;
        double volume;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Alpha Acid? ");
        alphaAcid = keyboard.nextDouble();
        
        System.out.print("Ounces? ");
        ounces = keyboard.nextDouble();
        
        double hbu = alphaAcid * ounces;
        System.out.printf("The HBUs are %.2f.\n", hbu);
        
        System.out.print("Weight? ");
        weight = keyboard.nextDouble();
        
        System.out.print("Lovibond? ");
        lovibond = keyboard.nextDouble();
        
        System.out.print("Volume? ");
        volume = keyboard.nextDouble();
        
        keyboard.close();
        
        double srm = (0.3 * weight * lovibond / volume) + 4.7;
        System.out.printf("The SRM value is %.4f.\n", srm);
        
    }
}
