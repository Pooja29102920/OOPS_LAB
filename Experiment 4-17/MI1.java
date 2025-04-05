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

class Admin extends User {
    Admin(String username) {
        super(username);
    }

    void resetPassword() {
        System.out.println(username + " reset a user's password.");
    }


    void blockUser() {
        System.out.println(username + " blocked a user.");
    }
}

class SuperAdmin extends Admin {
  
    SuperAdmin(String username) {
        super(username);
    }

    void grantPermissions() {
        System.out.println(username + " granted permissions.");
    }
    void accessLogs() {
        System.out.println(username + " accessed system logs.");
    }
}

public class MI1 {
    public static void main(String[] args) {
        SuperAdmin superAdmin = new SuperAdmin("SuperUser");
        superAdmin.login();
        superAdmin.resetPassword();
        superAdmin.blockUser();
        superAdmin.grantPermissions();
        superAdmin.accessLogs();
        superAdmin.logout();
    }
}