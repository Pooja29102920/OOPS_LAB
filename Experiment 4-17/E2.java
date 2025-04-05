class PackageDeliveryTracker {
    private String trackingNumber;
    private String status;

    public PackageDeliveryTracker(String trackingNumber, String status) {
        this.trackingNumber = trackingNumber;
        this.status = status;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

public class E2 {
    public static void main(String[] args) {
        PackageDeliveryTracker package1 = new PackageDeliveryTracker("123456", "In Transit");
        System.out.println("Tracking Number: " + package1.getTrackingNumber());
        System.out.println("Status: " + package1.getStatus());
        
        package1.setStatus("Delivered");
        System.out.println("Updated Status: " + package1.getStatus());
    }
}
