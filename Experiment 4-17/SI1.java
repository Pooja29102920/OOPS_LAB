class Laptop {
    String brand;
    int ram;
    int storage;

    Laptop(String brand, int ram, int storage) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
    }

    void specs() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }
}

class GamingLaptop extends Laptop {
    String graphicsCard;

    GamingLaptop(String brand, int ram, int storage, String graphicsCard) {
        super(brand, ram, storage);
        this.graphicsCard = graphicsCard;
    }


    void gamingSpecs() {
        specs(); // Call base class method
        System.out.println("Graphics Card: " + graphicsCard);
    }
}

public class SI1 {
    public static void main(String[] args) {
        GamingLaptop gl = new GamingLaptop("ASUS", 16, 512, "NVIDIA RTX 3060");
        gl.gamingSpecs();
    }
}
