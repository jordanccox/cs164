import java.util.Scanner;

public class Salary {
   public static void main(String [] args) {
      double wage;

      Scanner scnr = new Scanner(System.in);
      wage = scnr.nextDouble();

      System.out.print("Salary is ");
      System.out.println(wage * 40 * 50);
      
   }
}
