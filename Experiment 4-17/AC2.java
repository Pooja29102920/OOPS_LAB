abstract class Booking {
    abstract void confirmBooking();
    abstract void cancelBooking();
    abstract void getDetails();
}

class FlightBooking extends Booking {
    @Override
    void confirmBooking() {
        System.out.println("Flight booking confirmed");
    }
    
    @Override
    void cancelBooking() {
        System.out.println("Flight booking canceled");
    }
    
    @Override
    void getDetails() {
        System.out.println("Flight booking details");
    }
}

class HotelBooking extends Booking {
    @Override
    void confirmBooking() {
        System.out.println("Hotel booking confirmed");
    }
    
    @Override
    void cancelBooking() {
        System.out.println("Hotel booking canceled");
    }
    
    @Override
    void getDetails() {
        System.out.println("Hotel booking details");
    }
}

class TrainBooking extends Booking {
    @Override
    void confirmBooking() {
        System.out.println("Train booking confirmed");
    }
    
    @Override
    void cancelBooking() {
        System.out.println("Train booking canceled");
    }
    
    @Override
    void getDetails() {
        System.out.println("Train booking details");
    }
}

public class AC2 {
    public static void main(String[] args) {
        Booking flight = new FlightBooking();
        flight.confirmBooking();
        flight.getDetails();
        flight.cancelBooking();
        
        Booking hotel = new HotelBooking();
        hotel.confirmBooking();
        hotel.getDetails();
        hotel.cancelBooking();
        
        Booking train = new TrainBooking();
        train.confirmBooking();
        train.getDetails();
        train.cancelBooking();
    }
}