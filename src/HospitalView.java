// ==========================
// FILE : HospitalView.java
// ==========================

public class HospitalView {

    public void displayPatient(
            int id,
            String name,
            int age,
            String disease) {

        System.out.println("\n===== Patient Details =====");

        System.out.println("Patient ID : " + id);
        System.out.println("Patient Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Disease : " + disease);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}