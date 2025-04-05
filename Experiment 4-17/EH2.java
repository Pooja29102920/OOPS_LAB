import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class EH2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks (0 to 100): ");
        int marks = scan.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100.");
            } else {
                System.out.println("Marks recorded: " + marks);
            }
        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}