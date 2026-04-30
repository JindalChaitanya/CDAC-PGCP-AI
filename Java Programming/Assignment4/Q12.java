// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q12. You are tasked with implementing a Java program to manage bank  accounts. Each bank account has an account number, balance, and account holder name. The program should support deposit, withdrawal, and balance inquiry operations.
// Input
// createAccount   123 John 1000
// deposit 123 500
// withdraw 123 200
// balance 123
// Output
// Balance for account 123: 1300

package Assignment4;
import java.util.*;

class BankAccount {
    int accountNumber;
    String name;
    double balance;
    
    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        System.out.println("Enter commands: (createAccount, deposit, withdraw, balance) or 'exit' to quit");

        while (true) {
            String line = sc.nextLine();

            if (line.equalsIgnoreCase("exit")) break;
            if (line.trim().isEmpty()) continue;

            String[] tokens = line.split("\\s+");
            String operation = tokens[0];

            try {
                int accountNumber;
                double amount;

                switch (operation) {
                    case "createAccount":
                        accountNumber = Integer.parseInt(tokens[1]);
                        String name = tokens[2];
                        double balance = Double.parseDouble(tokens[3]);
                        accounts.put(accountNumber, new BankAccount(accountNumber, name, balance));
                        break;

                    case "deposit":
                        accountNumber = Integer.parseInt(tokens[1]);
                        amount = Double.parseDouble(tokens[2]);
                        if (accounts.containsKey(accountNumber)) {
                            accounts.get(accountNumber).deposit(amount);
                        }
                        break;

                    case "withdraw":
                        accountNumber = Integer.parseInt(tokens[1]);
                        amount = Double.parseDouble(tokens[2]);
                        if (accounts.containsKey(accountNumber)) {
                            accounts.get(accountNumber).withdraw(amount);
                        }
                        break;

                    case "balance":
                        accountNumber = Integer.parseInt(tokens[1]);
                        if (accounts.containsKey(accountNumber)) {
                            System.out.println("Balance for account " + accountNumber + ": " 
                                + (int)accounts.get(accountNumber).getBalance());
                        }
                        break;

                    default:
                        System.out.println("Invalid command");
                }

            } catch (Exception e) {
                System.out.println("Invalid input format");
            }
        }

        sc.close();
    }
}