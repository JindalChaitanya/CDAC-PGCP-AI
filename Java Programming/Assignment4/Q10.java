// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q10. Write a Java program to read an integer array from the user and calculate the average of its elements. Handle the InputMismatchException if the user enters a non-integer value.

package Assignment4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " +n+ " integers: ");
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double average = (double) sum / n;
            System.out.println("Average: " + average);
        } catch (Exception e) {
            System.out.println("InputMismatchException: Please enter integers only.");
        } finally {
            sc.close();
        }

        sc.close();
    }
}
