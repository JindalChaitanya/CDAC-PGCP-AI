// JAVA Programming Assignment - 1
// Submitted by Chaitanya Jindal

// Q3. Find the largest of two numbers entered by the user.

package Assignment1;

import java.util.Scanner;

public class Q3 {

    int[] inputTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.close();
        return new int[]{num1, num2};
    }

    void findLargest(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
    public static void main(String[] args) {
        Q3 obj = new Q3();
        int nums[] = obj.inputTwoNumbers();
        int num1 = nums[0];
        int num2 = nums[1];
        obj.findLargest(num1, num2);
    }
}
