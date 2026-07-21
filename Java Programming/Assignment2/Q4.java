// JAVA Programming Assignment - 2
// (Submitted by Chaitanya Jindal)

// Q4. Write  a method named sortStudents that takes the studentArray array as a parameter and sorts the array based on the grades of the students in ascending order. You can use any sorting algorithm of your choice (e.g., bubble sort )

package Assignment2;

public class Q4 {
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

    // Bubble sort based on grade, ascending order
    static void sortStudents(Student[] studentArray) {
        int n = studentArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (studentArray[j] != null && studentArray[j + 1] != null) {
                    if (studentArray[j].grade > studentArray[j + 1].grade) {
                        Student temp = studentArray[j];
                        studentArray[j] = studentArray[j + 1];
                        studentArray[j + 1] = temp;
                    }
                }
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

        System.out.println("Before Sorting:");
        displayStudents(studentArray);

        sortStudents(studentArray);

        System.out.println("\nAfter Sorting (by grade, ascending):");
        displayStudents(studentArray);
    }
}
