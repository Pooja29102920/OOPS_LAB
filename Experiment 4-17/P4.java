import school.Student;
import school.StudentManager;

public class P4 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Create sample student data
        String[] subjects1 = {"Math", "Science", "English", "History"};
        int[] marks1 = {95, 87, 89, 92};
        Student student1 = new Student(101, "John Doe", 18, subjects1, marks1);

        String[] subjects2 = {"Math", "Science", "English", "History"};
        int[] marks2 = {78, 85, 80, 75};
        Student student2 = new Student(102, "Jane Smith", 17, subjects2, marks2);

        // Add students to manager
        manager.addStudent(student1);
        manager.addStudent(student2);

        // Display total number of students
        System.out.println("Total Students: " + manager.getTotalStudents());

        // Display all students' information
        manager.displayAllStudents();
    }
}