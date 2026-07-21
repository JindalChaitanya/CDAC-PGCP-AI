// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q9. Students must pass in all 3 subjects (marks ≥ 35).
// • If failed in any subject → “Fail”
// • If passed in all → “Pass”
// Write a program to check the result.
package Assignment1;
import java.util.Scanner;
public class Q9 {
    String checkResult(int m1, int m2, int m3) {
        if (m1 >= 35 && m2 >= 35 && m3 >= 35) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();
        Q9 obj = new Q9();
        String result = obj.checkResult(m1, m2, m3);
        System.out.println("Result: " + result);
        sc.close();
    }
}