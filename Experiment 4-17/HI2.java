class Gadget {
    String brand;

    Gadget(String brand) {
        this.brand = brand;
    }

    void powerOn() {
        System.out.println(brand + " gadget powered on.");
    }

    void powerOff() {
        System.out.println(brand + " gadget powered off.");
    }
}

class Smartphone extends Gadget {
    Smartphone(String brand) {
        super(brand);
    }

    void makeCall() {
        System.out.println(brand + " smartphone making a call.");
    }

    void installApp() {
        System.out.println(brand + " smartphone installing an app.");
    }
}

class Laptop extends Gadget {
    Laptop(String brand) {
        super(brand);
    }

    void compileCode() {
        System.out.println(brand + " laptop compiling code.");
    }

    void runSoftware() {
        System.out.println(brand + " laptop running software.");
    }
}

class Tablet extends Gadget {
    Tablet(String brand) {
        super(brand);
    }

    void drawWithStylus() {
        System.out.println(brand + " tablet drawing with stylus.");
    }

    void watchMovie() {
        System.out.println(brand + " tablet watching a movie.");
    }
}

public class HI2 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung");
        phone.powerOn();
        phone.makeCall();
        phone.installApp();
        phone.powerOff();

        Laptop laptop = new Laptop("Dell");
        laptop.powerOn();
        laptop.compileCode();
        laptop.runSoftware();
        laptop.powerOff();

        Tablet tablet = new Tablet("Apple");
        tablet.powerOn();
        tablet.drawWithStylus();
        tablet.watchMovie();
        tablet.powerOff();
    }
}
