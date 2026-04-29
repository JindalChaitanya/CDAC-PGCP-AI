// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal
// Q8. A store gives discount based on purchase amount:
// • Above ₹5000 → 20% discount
// • ₹2000–₹5000 → 10% discount
// • Below ₹2000 → No discount
// Write a program to calculate the final payable amount.

package Assignment1;

import java.util.Scanner;

public class Q8 {

    double calculateFinalAmount(double amount) {
        if (amount > 5000) {
            return amount * 0.8;
        } else if (amount >= 2000) {
            return amount * 0.9;
        } else {
            return amount;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q8 obj = new Q8();
        System.out.print("Enter the purchase amount: ");
        double amount = sc.nextDouble();
        double finalAmount = obj.calculateFinalAmount(amount);
        System.out.println("Final payable amount: " + finalAmount);
        sc.close();
    }
}
