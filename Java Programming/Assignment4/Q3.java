// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q3. You are given a list of transactions. Each transaction is either:
// • "DEPOSIT x"
// • "WITHDRAW x"
// Rules:
// • Initial balance = 0
// • If a withdrawal causes negative balance → throw exception
// • On exception → rollback all previous transactions and print "Transaction Failed"
// • Otherwise → print final balance
// Input: N
// transaction 1
// transaction 2
// Example
// Input:        3
// DEPOSIT 100
// WITHDRAW 50
// WITHDRAW 100
// Output:
// Transaction Failed

package Assignment4;

import java.util.Scanner;

public class Q3 {
    int balance = 0;
    
    void withdraw(int amount) throws Exception {
        if (balance - amount < 0) {
            throw new Exception("Transaction Failed");
        }
        balance -= amount;
    }

    void deposit(int amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine();
        Q3 obj = new Q3();
        boolean transactionFailed = false;
        for (int i = 0; i < n; i++) {
            System.out.print("Transaction " + (i+1) + ": " );
            String transaction = sc.nextLine();
            String[] parts = transaction.split(" ");
            String type = parts[0];
            int amount = Integer.parseInt(parts[1]);

            try {
                if (type.equals("DEPOSIT")) {
                    obj.deposit(amount);
                } else if (type.equals("WITHDRAW")) {
                    obj.withdraw(amount);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                transactionFailed = true;
                break;
            }
        }

        if (!transactionFailed) {
            System.out.println("Final balance: " + obj.balance);
        }

        sc.close();
    }
}