// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q9. Implement a Java program to read an integer from the user and  calculate its square root. Handle the InputMismatchException if the user enters a non-integer value.

package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int number = sc.nextInt();
            double sqrt = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + sqrt);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            sc.close();
        }
    }
}
