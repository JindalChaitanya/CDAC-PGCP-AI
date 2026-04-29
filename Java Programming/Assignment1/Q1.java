// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q1. Check whether a number entered by the user is even or odd.

import java.util.Scanner;

public class Q1 {

    void isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Q1 obj = new Q1();
        obj.isEvenOrOdd(number);
        sc.close();
    }
}
