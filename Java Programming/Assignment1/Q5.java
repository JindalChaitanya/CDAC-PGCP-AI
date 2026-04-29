// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q5. A student’s marks are entered. Display the grade based on the marks.
// • 90 and above → A
// • 75–89 → B
// • 50–74 → C
// • Below 50 → Fail

package Assignment1;

import java.util.Scanner;

public class Q5 {

    int inputMarks(Scanner sc) {
        System.out.print("Enter the marks: ");
        return sc.nextInt();
    }

    String getGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        
        Q5 obj = new Q5();
        Scanner sc = new Scanner(System.in);
        int marks = obj.inputMarks(sc);
        String grade = obj.getGrade(marks);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
