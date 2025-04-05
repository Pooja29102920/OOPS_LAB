class ATMMachine {
    private double balance;
    private String pin;

    public ATMMachine(double balance, String pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public double getBalance(String enteredPin) {
        if (this.pin.equals(enteredPin)) {
            return balance;
        } else {
            System.out.println("Incorrect PIN");
            return -1;
        }
    }

    public void setBalance(String enteredPin, double amount) {
        if (this.pin.equals(enteredPin)) {
            this.balance = amount;
            System.out.println("Balance updated successfully");
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void withdraw(String enteredPin, double amount) {
        if (this.pin.equals(enteredPin)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }
}

public class E3 {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine(5000, "1234");
        System.out.println("Current Balance: " + atm.getBalance("1234"));
        atm.withdraw("1234", 1000);
        atm.setBalance("1234", 7000);
        System.out.println("Updated Balance: " + atm.getBalance("1234"));
    }
}
