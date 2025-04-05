import java.util.Scanner;

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class EH1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        try {
            if (age < 18) {
                throw new UnderageException("You must be 18 or older to apply for Voter ID.");
            } else {
                System.out.println("You are eligible to apply for a Voter ID.");
            }
        } catch (UnderageException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}