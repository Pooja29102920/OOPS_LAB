class Doctor {
    String name;
    String specialty;

    Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }


    void treatPatient() {
        System.out.println(name + " is treating a patient in " + specialty);
    }
}
class Surgeon extends Doctor {
    String surgeryType;
    Surgeon(String name, String specialty, String surgeryType) {
        super(name, specialty);
        this.surgeryType = surgeryType;
    }


    void performSurgery() {
        System.out.println(name + " is performing a " + surgeryType + " surgery.");
    }
}
public class SI2 {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Dr. Smith", "Cardiology", "Heart");
        surgeon.treatPatient();
        surgeon.performSurgery();
    }
}
