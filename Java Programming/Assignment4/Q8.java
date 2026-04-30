// JAVA Programming Assignment - 4
// (Submitted by Chaitanya Jindal)

// Q8. Write a program that define interface Admission having abstract method registration.
// Create another class Student in separate file having method Addstudent ()
// a) In Addstudent create local class Mtech student that inherits Admission interface
// b) In same method also create anonymous class that also inherits Admission interface
// c) In both above classes implement registration method
// d) In main call AddStudent method of student class.

package Assignment4;
import java.util.Scanner;

interface Admission {
    void registration();
}

class Student {
    void Addstudent() {
        class MtechStudent implements Admission {
            public void registration() {
                System.out.println("New Student Registered");
            }
        }
        MtechStudent m = new MtechStudent();
        m.registration();

        Admission a = new Admission() {
            public void registration() {
                System.out.println("Anonymous Student Registered");
            }
        };
        a.registration();
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.Addstudent();

        sc.close();
    }
}