import java.util.Scanner;

class UsernameTooShortException extends Exception {
    public UsernameTooShortException(String message) {
        super(message);
    }
}

public class EH3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scan.nextLine();

        try {
            if (username.length() < 5) {
                throw new UsernameTooShortException("Username must be at least 5 characters long.");
            } else {
                System.out.println("Username accepted: " + username);
            }
        } catch (UsernameTooShortException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}