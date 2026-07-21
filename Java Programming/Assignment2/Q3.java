// JAVA Programming Assignment - 2
// (Submitted by Chaitanya Jindal)

// Q3. Create a class named Student with the following attributes:
// · name (String): to store the name of the student.
// · id (int): to store the student ID.
// · grade (double): to store the grade of the student.
// Implement a constructor to initialize these attributes.
// · In the main method, create an array named studentArray that can hold up to 10 Student objects.
// · Initialize the studentArray array with different Student objects. You can use fictional student data for this.
// · Write a method named displayStudents that takes the studentArray array as a parameter and displays the details of each student in the array.

package Assignment2;

public class Q3 {
    static void displayStudents(Student[] studentArray) {
        System.out.println("----- Student Details -----");
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] != null) {
                System.out.println("ID: " + studentArray[i].id +
                        ", Name: " + studentArray[i].name +
                        ", Grade: " + studentArray[i].grade);
            }
        }
    }

    public static void main(String[] args) {
        Student[] studentArray = new Student[10];
        studentArray[0] = new Student("Aarav", 101, 78.5);
        studentArray[1] = new Student("Diya", 102, 92.0);
        studentArray[2] = new Student("Kabir", 103, 65.3);
        studentArray[3] = new Student("Isha", 104, 88.7);
        studentArray[4] = new Student("Rohan", 105, 55.2);

        displayStudents(studentArray);
    }
}
