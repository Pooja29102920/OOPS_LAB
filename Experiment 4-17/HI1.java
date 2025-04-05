class User {
    String username;

    User(String username) {
        this.username = username;
    }

    void login() {
        System.out.println(username + " logged in.");
    }

    void logout() {
        System.out.println(username + " logged out.");
    }
}

class Student extends User {
    Student(String username) {
        super(username);
    }

    void enrollCourse() {
        System.out.println(username + " enrolled in a course.");
    }

    void submitAssignment() {
        System.out.println(username + " submitted an assignment.");
    }
}

class Teacher extends User {
    Teacher(String username) {
        super(username);
    }

    void createCourse() {
        System.out.println(username + " created a course.");
    }

    void gradeAssignment() {
        System.out.println(username + " graded an assignment.");
    }
}

class Admin extends User {
    Admin(String username) {
        super(username);
    }

    void manageUsers() {
        System.out.println(username + " managed users.");
    }

    void viewReports() {
        System.out.println(username + " viewed reports.");
    }
}

public class HI1 {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.login();
        student.enrollCourse();
        student.submitAssignment();
        student.logout();

        Teacher teacher = new Teacher("Bob");
        teacher.login();
        teacher.createCourse();
        teacher.gradeAssignment();
        teacher.logout();

        Admin admin = new Admin("Charlie");
        admin.login();
        admin.manageUsers();
        admin.viewReports();
        admin.logout();
    }
}
