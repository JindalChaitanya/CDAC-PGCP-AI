// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q5. Create a class named InputSafeCalculator.Implement a static method  calculateRatio(String num1Str, String num2Str) that returns a
// String.Inside the method, use a single try block to:
// • Convert num1Str and num2Str to integers using Integer.parseInt().
// • Calculate the integer division of the first number by the second.
// • Return the result as a String.
// Implement a multi-catch block  to handle both NumberFormatException (if Integer.parseInt() fails) and ArithmeticException (if the divisor is 0). In the catch block, print an  error message specifying the type of error and return "Error: Invalid  operation."Include a finally block that prints: "Cleanup complete: Ratio   calculation finished."In the main method, test the function with:
// • Valid input (e.g., "10", "2").
// • NumberFormatException input (e.g., "ten", "2").
// • ArithmeticException input (e.g., "10", "0").

package Assignment4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your code here

        sc.close();
    }
}
