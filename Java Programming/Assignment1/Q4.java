// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q4. The user enters account balance and withdrawal amount. Check if withdrawal is possible.

package Assignment1;

import java.util.Scanner;

public class Q4 {
    
    int inputAccountBalance(Scanner sc) {
        System.out.print("Enter your account balance: ");
        return sc.nextInt();
    }

    int inputWithdrawalAmount(Scanner sc) {
        System.out.print("Enter the withdrawal amount: ");
        return sc.nextInt();
    }

    void checkWithdrawal(int balance, int amount) {
        if (amount <= balance) {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
        } else {
            System.out.println("Insufficient funds. Withdrawal not possible.");
        }
    }

    public static void main(String[] args) {
        Q4 obj = new Q4();
        Scanner sc = new Scanner(System.in);
        int balance = obj.inputAccountBalance(sc);
        int amount = obj.inputWithdrawalAmount(sc);
        obj.checkWithdrawal(balance, amount);
        sc.close();
    }
}
