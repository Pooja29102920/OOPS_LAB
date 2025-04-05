interface ControllableDevice {
    void turnOn();
    void turnOff();
    void connectToApp();
}

class SmartFan implements ControllableDevice {
    @Override
    public void turnOn() {
        System.out.println("SmartFan: Turned On");
    }
    
    @Override
    public void turnOff() {
        System.out.println("SmartFan: Turned Off");
    }
    
    @Override
    public void connectToApp() {
        System.out.println("SmartFan: Connected to App");
    }
}

class SmartBulb implements ControllableDevice {
    @Override
    public void turnOn() {
        System.out.println("SmartBulb: Turned On");
    }
    
    @Override
    public void turnOff() {
        System.out.println("SmartBulb: Turned Off");
    }
    
    @Override
    public void connectToApp() {
        System.out.println("SmartBulb: Connected to App");
    }
}

class SmartDoor implements ControllableDevice {
    @Override
    public void turnOn() {
        System.out.println("SmartDoor: Unlocked");
    }
    
    @Override
    public void turnOff() {
        System.out.println("SmartDoor: Locked");
    }
    
    @Override
    public void connectToApp() {
        System.out.println("SmartDoor: Connected to App");
    }
}

public class I3{
    public static void main(String[] args) {
        ControllableDevice fan = new SmartFan();
        fan.turnOn();
        fan.turnOff();
        fan.connectToApp();
        
        ControllableDevice bulb = new SmartBulb();
        bulb.turnOn();
        bulb.turnOff();
        bulb.connectToApp();
        
        ControllableDevice door = new SmartDoor();
        door.turnOn();
        door.turnOff();
        door.connectToApp();
    }
}
