import java.util.Scanner;

public class E1 {
    private String lockCode;
    private boolean isLocked;

    public String getLockCode() {
        return lockCode;
    }

    public void setLockCode(String lockCode) {
        this.lockCode = lockCode;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean unlock(String code) {
        if (code.equals(lockCode)) {
            isLocked = false;
            return true;
        }
        return false;
    }

    public void lock() {
        isLocked = true;
    }

    public static void main(String[] args) {
        E1 lock = new E1();
        Scanner scanner = new Scanner(System.in);

        lock.setLockCode("1234");
        lock.setLocked(true);

        System.out.println("Enter code to unlock:");
        String input = scanner.nextLine();

        if (lock.unlock(input)) {
            System.out.println("Unlocked successfully!");
        } else {
            System.out.println("Incorrect code. Lock remains engaged.");
        }

        lock.lock();
        System.out.println("Lock status: " + (lock.isLocked() ? "Locked" : "Unlocked"));
    }
}