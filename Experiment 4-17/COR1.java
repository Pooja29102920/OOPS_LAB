class Notification {
    Notification() {
        sendAlert();
    }
    
    void sendAlert() {
        System.out.println("Sending general notification");
    }
}

class EmailNotification extends Notification {
    EmailNotification() {
        super();
    }
    
    @Override
    void sendAlert() {
        System.out.println("Sending email notification");
    }
}

class SMSNotification extends Notification {
    SMSNotification() {
        super();
    }
    
    @Override
    void sendAlert() {
        System.out.println("Sending SMS notification");
    }
}

class PushNotification extends Notification {
    PushNotification() {
        super();
    }
    
    @Override
    void sendAlert() {
        System.out.println("Sending push notification");
    }
}

public class COR1 {
    public static void main(String[] args) {
        new EmailNotification();
        new SMSNotification();
        new PushNotification();
    }
}
