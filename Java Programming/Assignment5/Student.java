package Assignment5;

public class Student {
    int rollno;
    String sname;
    String address;

    Student(int rollno, String sname, String address) {
        this.rollno = rollno;
        this.sname = sname;
        this.address = address;
    }

    void display() {
        System.out.println("Roll No: " + rollno + ", Name: " + sname + ", Address: " + address);
    }
}