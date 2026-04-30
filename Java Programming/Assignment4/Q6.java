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

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your code here

        sc.close();
    }
}
