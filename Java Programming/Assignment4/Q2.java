// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q2. Given an array of size N and an index K, print the element at index K.
// • If index is invalid, print "Index out of bounds"
// Input: N array elements K index
// Output: Element OR error message
// Example
// Input:    5
// 1 2 3 4 5
// 2
// Output: 3
// Input:   5
// 1 2 3 4 5
// 10
// Output : Index out of bounds

package Assignment4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index: ");
        int K = sc.nextInt();

        if (K < 0 || K >= N) {
            System.out.println("Index out of bounds");
        } else {
            System.out.println("Element at index " + K + ": " + arr[K]);
        }

        sc.close();
    }
}