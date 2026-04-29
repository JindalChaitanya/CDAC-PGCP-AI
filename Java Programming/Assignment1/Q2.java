// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q2. Check if a person is eligible to vote (age must be 18 or above).
package Assignment1;

import java.util.Scanner;

public class Q2 {

    void isEligible(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        Q2 obj = new Q2();
        obj.isEligible(age);
        sc.close();
    }
}