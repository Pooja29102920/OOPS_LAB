class UserLoginLogger {
    void logIn(String username) {
        System.out.println(username + " logged in.");
    }

    void logIn(String username, String password) {
        System.out.println(username + " logged in with password.");
    }

    void logIn(String username, String password, String location) {
        System.out.println(username + " logged in from " + location + ".");
    }
}

public class OL2 {
    public static void main(String[] args) {
        UserLoginLogger logger = new UserLoginLogger();
        logger.logIn("Alice");
        logger.logIn("Alice", "password123");
        logger.logIn("Alice", "password123", "New York");
    }
}
