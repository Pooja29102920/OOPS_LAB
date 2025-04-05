package school;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        if(students.isEmpty()) {
            System.out.println("No students registered yet!");
            return;
        }

        System.out.println("\n=== All Students Information ===\n");
        for(Student student : students) {
            student.displayInfo();
            System.out.println("================================");
        }
    }

    public int getTotalStudents() {
        return students.size();
    }
}