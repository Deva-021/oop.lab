class Patient {
    String name;
    int age;
    String disease;
    String assignedDoctor;

    Patient() {
        this.name = "Unknown";
        this.age = 0;
        this.disease = "General Checkup";
        this.assignedDoctor = "General Physician";
    }

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.disease = "Undiagnosed";
        this.assignedDoctor = "General Physician";
    }

    Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.assignedDoctor = "Specialist";
    }

    Patient(String name, int age, String disease, String assignedDoctor) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.assignedDoctor = assignedDoctor;
    }

    void displayPatientDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Disease: " + disease + ", Doctor: " + assignedDoctor);
    }
}

public class ConstructorOverloading2 {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient("John Doe", 30);
        Patient patient3 = new Patient("Jane Smith", 45, "Heart Disease");
        Patient patient4 = new Patient("David Lee", 60, "Cancer", "Dr. Wilson");

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        patient3.displayPatientDetails();
        patient4.displayPatientDetails();
    }
}