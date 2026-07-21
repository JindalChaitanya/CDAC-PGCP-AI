// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q12. User enters:
// • PIN
// • Balance
// • Withdrawal amount
// Conditions:
// • PIN must match
// • Withdrawal ≤ balance
// • Minimum balance after withdrawal must be ₹1000
// • Display proper message for each case.

package Assignment1;
import java.util.Scanner;
public class Q12 {
    String withdraw(int enteredPin, int actualPin, double balance, double amount) {
        if (enteredPin != actualPin) {
            return "Incorrect PIN";
        } else if (amount > balance) {
            return "Insufficient balance";
        } else if ((balance - amount) < 1000) {
            return "Withdrawal denied: Minimum balance of Rs. 1000 must be maintained";
        } else {
            return "Withdrawal successful. Remaining balance: " + (balance - amount);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actualPin = 1234;
        double balance = 5000;

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        Q12 obj = new Q12();
        String message = obj.withdraw(enteredPin, actualPin, balance, amount);
        System.out.println(message);
        sc.close();
    }
}