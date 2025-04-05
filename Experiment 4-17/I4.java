interface Ridable {
    void bookRide();
    void calculateFare();
    void cancelRide();
}

class Bike implements Ridable {
    @Override
    public void bookRide() {
        System.out.println("Bike: Ride Booked");
    }
    
    @Override
    public void calculateFare() {
        System.out.println("Bike: Calculating Fare");
    }
    
    @Override
    public void cancelRide() {
        System.out.println("Bike: Ride Cancelled");
    }
}

class Auto implements Ridable {
    @Override
    public void bookRide() {
        System.out.println("Auto: Ride Booked");
    }
    
    @Override
    public void calculateFare() {
        System.out.println("Auto: Calculating Fare");
    }
    
    @Override
    public void cancelRide() {
        System.out.println("Auto: Ride Cancelled");
    }
}

class Cab implements Ridable {
    @Override
    public void bookRide() {
        System.out.println("Cab: Ride Booked");
    }
    
    @Override
    public void calculateFare() {
        System.out.println("Cab: Calculating Fare");
    }
    
    @Override
    public void cancelRide() {
        System.out.println("Cab: Ride Cancelled");
    }
}

public class I4 {
    public static void main(String[] args) {
        Ridable bike = new Bike();
        bike.bookRide();
        bike.calculateFare();
        bike.cancelRide();
        
        Ridable auto = new Auto();
        auto.bookRide();
        auto.calculateFare();
        auto.cancelRide();
        
        Ridable cab = new Cab();
        cab.bookRide();
        cab.calculateFare();
        cab.cancelRide();
    }
}