package Assignment5;

public class TreeStudent implements Comparable<TreeStudent> {
    private int studentId;
    private String name;
    private double gpa;

    TreeStudent(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Natural ordering based on studentId, ascending
    @Override
    public int compareTo(TreeStudent other) {
        return this.studentId - other.studentId;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", GPA: " + gpa;
    }
}