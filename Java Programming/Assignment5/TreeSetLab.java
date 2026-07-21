package Assignment5;
import java.util.TreeSet;

public class TreeSetLab {
    public static void main(String[] args) {
        TreeSet<TreeStudent> studentSet = new TreeSet<>();

        TreeStudent s1 = new TreeStudent(101, "Alice", 3.8);
        TreeStudent s2 = new TreeStudent(105, "Bob", 3.2);
        TreeStudent s3 = new TreeStudent(101, "Charlie", 3.5);
        TreeStudent s4 = new TreeStudent(103, "David", 4.0);
        TreeStudent s5 = new TreeStudent(101, "Alice", 3.8);

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);

        System.out.println("Students in TreeSet (ordered by studentId):");
        for (TreeStudent s : studentSet) {
            System.out.println(s);
        }
    }
}