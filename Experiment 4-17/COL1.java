class SmartLight {
    String color;
    int brightness;
    int duration;

    SmartLight() {
        this.color = "White";
        this.brightness = 100;
        this.duration = 0;
        System.out.println("Light turned on: " + color + " at brightness " + brightness);
    }

    SmartLight(String color) {
        this.color = color;
        this.brightness = 100;
        this.duration = 0;
        System.out.println("Light turned on: " + color + " at brightness " + brightness);
    }

    SmartLight(String color, int brightness) {
        this.color = color;
        this.brightness = brightness;
        this.duration = 0;
        System.out.println("Light turned on: " + color + " at brightness " + brightness);
    }

    SmartLight(String color, int brightness, int duration) {
        this.color = color;
        this.brightness = brightness;
        this.duration = duration;
        System.out.println("Light turned on: " + color + " at brightness " + brightness + " for " + duration + " minutes");
    }
}

public class COL1 {
    public static void main(String[] args) {
        new SmartLight();
        new SmartLight("Blue");
        new SmartLight("Red", 75);
        new SmartLight("Green", 50, 30);
    }
}
