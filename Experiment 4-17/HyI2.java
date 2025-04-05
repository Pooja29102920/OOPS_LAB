interface Diagnosable {
    void performDiagnosis();
}

interface Treatable {
    void giveTreatment();
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Doctor extends Person implements Diagnosable, Treatable {
    Doctor(String name, int age) {
        super(name, age);
    }

    public void performDiagnosis() {
        System.out.println(name + " is diagnosing a patient.");
    }

    public void giveTreatment() {
        System.out.println(name + " is giving treatment.");
    }
}

class Surgeon extends Doctor {
    Surgeon(String name, int age) {
        super(name, age);
    }

    void performSurgery() {
        System.out.println(name + " is performing surgery.");
    }
}

class Nurse extends Person implements Treatable {
    Nurse(String name, int age) {
        super(name, age);
    }

    public void giveTreatment() {
        System.out.println(name + " is administering medication.");
    }
}

public class HyI2 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", 45);
        doctor.getDetails();
        doctor.performDiagnosis();
        doctor.giveTreatment();

        Surgeon surgeon = new Surgeon("Dr. Adams", 50);
        surgeon.getDetails();
        surgeon.performDiagnosis();
        surgeon.giveTreatment();
        surgeon.performSurgery();

        Nurse nurse = new Nurse("Alice", 30);
        nurse.getDetails();
        nurse.giveTreatment();
    }
}