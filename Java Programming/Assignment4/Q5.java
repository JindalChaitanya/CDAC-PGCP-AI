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

class InputSafeCalculator {
    public static String calculateRatio(String num1Str, String num2Str) {
        try {
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);
            int result = num1 / num2;
            return String.valueOf(result);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error: " + e.getClass().getSimpleName() + " occurred.");
            return "Error: Invalid operation.";
        } finally {
            System.out.println("Cleanup complete: Ratio calculation finished.");
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= t; i++) {
            System.out.println("\nTest Case " + i);

            System.out.print("Enter first number: ");
            String num1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String num2 = sc.nextLine();

            System.out.println("Result: " + 
                InputSafeCalculator.calculateRatio(num1, num2));
        }

        sc.close();
    }
}