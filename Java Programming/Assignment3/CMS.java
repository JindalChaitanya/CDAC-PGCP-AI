// JAVA Programming Assignment - 5
// (Submitted by Chaitanya Jindal)

// Q1. Create a small application in Java for College Management System.

// Requirements
// • Create a class Teacher containing:
//   • Name
//   • Qualification

// • Extend the Teacher class into a Department class containing:
//   • Department Number
//   • Department Name

// • Create an interface named College containing:
//   • One field: Name of the College
//   • Two abstract methods:
//     • getDetails()
//     • showDetails()
//   • One default method displaying a general message
//   • One static method displaying a general message

// • Override base class and interface methods in the derived class

// • Ask department name from the user and validate:
//   • "IT dept"
//   • "Management dept"
//
// • If department name does not match, display:
//   • "Not a valid Record"

// • Assign department numbers as:
//   • IT dept → 10
//   • Management dept → 20

// • Display appropriate information using the created classes and interface
// • Create a class CMS containing the main() method where all functionalities are called

package Assignment3;

import java.util.*;

interface College {
    String CollegeName = "CDAC";

    void getDetails();
    void showDetails();

    default void generalMessage() {
        System.out.println("Welcome to CMS");
    }

    static void displayRules() {
        System.out.println("Please enter valid department details...");
    }
}

class Teacher {
    String name = null;
    String qualification = null;

    void teacherDetails(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }
}

class Department extends Teacher implements College {
    double deptno;
    String deptname = null;

    Scanner sc = new Scanner(System.in);

    @Override
    public void getDetails() {
        System.out.print("Enter Teacher Name: ");
        name = sc.next();

        System.out.print("Enter the qualification: ");
        qualification = sc.next();

        System.out.print("Enter Department Name: ");
        deptname = sc.next();


        if (deptname.equalsIgnoreCase("IT")) {
            deptno = 10;
        }

        else if (deptname.equalsIgnoreCase("Management")) {
            deptno = 20;
        }

        else {
            System.out.println("Not a Valid Record.");
            System.exit(0);
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Details:-");
        System.out.println("College Name: " + CollegeName);
        System.out.println("Techer Name: " + name);
        System.out.println("Department Name: " + deptname);
        System.out.println("Department Number: " + deptno);
    }

}

public class CMS {

    public static void main(String[] args) {
        
        Department d = new Department();

        d.generalMessage();
        College.displayRules();
        d.getDetails();
        d.showDetails();

    }
}
