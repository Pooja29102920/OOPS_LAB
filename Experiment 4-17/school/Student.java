package school;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String[] subjects;
    private int[] marks;

    public Student(int rollNo, String name, int age, String[] subjects, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for(int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public String getGrade() {
        double avg = calculateAverage();
        if(avg >= 90) return "A+";
        else if(avg >= 80) return "A";
        else if(avg >= 70) return "B";
        else if(avg >= 60) return "C";
        else if(avg >= 50) return "D";
        else return "F";
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("\nSubject-wise Marks:");
        for(int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
    }
}