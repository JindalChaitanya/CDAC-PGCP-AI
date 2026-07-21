// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q10. Ticket price depends on age:
// • Below 5 years → Free
// • 5–18 years → ₹100
// • 19–60 years → ₹200
// • Above 60 years → ₹150
// Write a program to calculate ticket price.

package Assignment1;
import java.util.Scanner;
public class Q10 {
    int calculatePrice(int age) {
        if (age < 5) {
            return 0;
        } else if (age <= 18) {
            return 100;
        } else if (age <= 60) {
            return 200;
        } else {
            return 150;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        Q10 obj = new Q10();
        int price = obj.calculatePrice(age);
        if (price == 0) {
            System.out.println("Ticket Price: Free");
        } else {
            System.out.println("Ticket Price: Rs. " + price);
        }
        sc.close();
    }
}