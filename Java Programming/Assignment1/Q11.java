// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q11. If years of experience:
// • Less than 2 years → No bonus
// • 2–5 years → 10% bonus
// • More than 5 years → 20% bonus
// Write a program to calculate total salary after bonus.

package Assignment1;
import java.util.Scanner;
public class Q11 {
    double calculateSalary(double salary, double experience) {
        double bonus;
        if (experience < 2) {
            bonus = 0;
        } else if (experience <= 5) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.20;
        }
        return salary + bonus;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of experience: ");
        double experience = sc.nextDouble();
        Q11 obj = new Q11();
        double totalSalary = obj.calculateSalary(salary, experience);
        System.out.println("Total Salary after bonus: " + totalSalary);
        sc.close();
    }
}