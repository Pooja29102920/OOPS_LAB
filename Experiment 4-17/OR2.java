class Booking {
    void calculateFare() {
        System.out.println("Calculating fare for booking");
    }
}

class FlightBooking extends Booking {
    @Override
    void calculateFare() {
        System.out.println("Calculating fare for flight booking");
    }
}

class TrainBooking extends Booking {
    @Override
    void calculateFare() {
        System.out.println("Calculating fare for train booking");
    }
}

class BusBooking extends Booking {
    @Override
    void calculateFare() {
        System.out.println("Calculating fare for bus booking");
    }
}

public class OR2 {
    public static void main(String[] args) {
        Booking flight = new FlightBooking();
        Booking train = new TrainBooking();
        Booking bus = new BusBooking();

        flight.calculateFare();
        train.calculateFare();
        bus.calculateFare();
    }
}
