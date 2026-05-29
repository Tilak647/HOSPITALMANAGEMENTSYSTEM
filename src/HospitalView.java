
public class HospitalView {

    // DISPLAY PATIENT DETAILS
    public void displayPatient(int id,
    String name,
    int age,
    String disease) {

        System.out.println("\n===== PATIENT DETAILS =====");

        System.out.println("Patient ID : " + id);
        System.out.println("Patient Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Disease : " + disease);
    }

    // DISPLAY MESSAGE
    public void showMessage(String message) {

        System.out.println(message);
    }
}
