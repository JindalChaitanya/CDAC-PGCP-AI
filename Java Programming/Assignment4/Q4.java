// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q4. Build a shopping cart where users can purchase items.
// Requirements
// • Input:
// • Product price
// • Quantity
// Calculate total bill
// Exception Rules
// • Quantity ≤ 0 → "InvalidQuantityException"
// • Price ≤ 0 →      "InvalidPriceException"
// Bonus
// • Apply discount if total > 5000

package Assignment4;
import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            if (price <= 0) {
                throw new InvalidPriceException("InvalidPriceException");
            }
            if (quantity <= 0) {
                throw new InvalidQuantityException("InvalidQuantityException");
            }

            double total = price * quantity;
            if (total > 5000) {
                total *= 0.9;
            }
            System.out.println("Total bill: " + total);


        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }

        sc.close();
    }
}
