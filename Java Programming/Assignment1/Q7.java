// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q7. A user must enter:
// • Username: admin
// • Password: 1234
// Write a program to check login credentials and display:
// • “Login Successful”
// • “Invalid Username or Password”

package Assignment1;

import java.util.Scanner;

public class Q7 {

    protected static final String uName = "admin";
    protected static final String uPass = "1234";

    boolean CheckLogin(String username, String password) {
        return username.equals(uName) && password.equals(uPass);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q7 obj = new Q7();
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        if (obj.CheckLogin(username, password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
        sc.close();
    }
}
