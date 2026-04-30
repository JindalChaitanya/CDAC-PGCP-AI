// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q6. Create a class named SecurityManager. Implement a static method checkPassword(String password):
// • It must declare throws Exception in its signature.
// • If the password is null or empty, use throw new Exception("Authentication failure: Password cannot be empty.").
// • If the password is valid, print "Password check successful."
// Implement a static method processData(String password):
// • It must call checkPassword(password).
// • Wrap the call in a try-catch block to handle the declared Exception.
// • If the Exception is caught, the method must print a log message
// • If no exception occurs, print "Data successfully processed."
// In the main method, call processData() twice :
// once with a valid password ("secret"),
// and once with an invalid password (null).
// Wrap the calls in a try-catch block to catch

package Assignment4;
import java.util.Scanner;

class SecurityManager {
    public static void checkPassword(String password) throws Exception {
        if (password == null || password.isEmpty()) {
            throw new Exception("Authentication failure: Password cannot be empty.");
        }
        System.out.println("Password check successful.");
    }

    public static void processData(String password) {
        try {
            checkPassword(password);
            System.out.println("Data successfully processed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            SecurityManager.processData("secret");
            SecurityManager.processData(null);

        } catch (Exception e) {
            System.out.println("Main caught exception: " + e.getMessage());
        }

        sc.close();
    }
}