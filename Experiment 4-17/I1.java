interface DeliveryPartner {
    void acceptOrder();
    void trackOrder();
    void deliverOrder();
}

class Zomato implements DeliveryPartner {
    @Override
    public void acceptOrder() {
        System.out.println("Zomato: Order Accepted");
    }
    
    @Override
    public void trackOrder() {
        System.out.println("Zomato: Tracking Order");
    }
    
    @Override
    public void deliverOrder() {
        System.out.println("Zomato: Order Delivered");
    }
}

class Swiggy implements DeliveryPartner {
    @Override
    public void acceptOrder() {
        System.out.println("Swiggy: Order Accepted");
    }
    
    @Override
    public void trackOrder() {
        System.out.println("Swiggy: Tracking Order");
    }
    
    @Override
    public void deliverOrder() {
        System.out.println("Swiggy: Order Delivered");
    }
}

class UberEats implements DeliveryPartner {
    @Override
    public void acceptOrder() {
        System.out.println("UberEats: Order Accepted");
    }
    
    @Override
    public void trackOrder() {
        System.out.println("UberEats: Tracking Order");
    }
    
    @Override
    public void deliverOrder() {
        System.out.println("UberEats: Order Delivered");
    }
}

public class I1 {
    public static void main(String[] args) {
        DeliveryPartner zomato = new Zomato();
        zomato.acceptOrder();
        zomato.trackOrder();
        zomato.deliverOrder();
        
        DeliveryPartner swiggy = new Swiggy();
        swiggy.acceptOrder();
        swiggy.trackOrder();
        swiggy.deliverOrder();
        
        DeliveryPartner uberEats = new UberEats();
        uberEats.acceptOrder();
        uberEats.trackOrder();
        uberEats.deliverOrder();
    }
}
