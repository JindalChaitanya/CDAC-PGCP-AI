// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q1. You are given two integers a and b. Perform division a / b.
// • If b = 0, print "Division by zero is not allowed"
// • Otherwise, print the result
// Input: Two integers a and b Output
// Result of division OR error message
// Example
// Input:       10 2
// Output:     	5
// Input:       10 0
// Output:     Division by zero is not allowed

package Assignment4;

import java.util.Scanner;

public class Q1 {

    int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        Q1 obj = new Q1();
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
        } else {
            int result = obj.divide(a, b);
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
