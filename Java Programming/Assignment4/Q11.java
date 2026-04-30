// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q11. Develop a Java program to read a string from the user and convert it into an integer. Handle the NumberFormatException if the string cannot be converted to an integer.

package Assignment4;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to convert to an integer: ");
        String input = sc.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("The integer value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input string cannot be converted to an integer.");
        } finally {
            sc.close();
        }
    }
}