package Assignment5;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> studentList = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Student " + i);
            System.out.print("Roll No: ");
            int rollno = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            System.out.print("Name: ");
            String sname = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();

            Student s = new Student(rollno, sname, address);
            studentList.add(s);
            System.out.println();
        }

        System.out.println("----- Student Details -----");
        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            s.display();
        }

        sc.close();
    }
}