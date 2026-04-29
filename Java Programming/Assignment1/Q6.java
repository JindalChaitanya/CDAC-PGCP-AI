// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q6. An electricity board charges:
// • First 100 units → ₹5 per unit
// • Next 200 units → ₹7 per unit
// • Above 300 units → ₹10 per unit
// Write a Java program to calculate the total bill based on units consumed.

package Assignment1;

import java.util.Scanner;

public class Q6 {
    double calculateBill(int units) {
        double bill = 0;
        if (units <= 100)
            bill = units * 5;
        else if (units <= 300)
            bill = 100 * 5 + (units - 100) * 7;
        else
            bill = 100 * 5 + 200 * 7 + (units - 300) * 10;
        return bill;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units consumed: ");
        int units = sc.nextInt();
        double bill = new Q6().calculateBill(units);
        System.out.println("Total bill: " + bill);
        sc.close();
    }
}
