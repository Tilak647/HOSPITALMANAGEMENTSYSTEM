// ==========================
// FILE : Main.java
// ==========================

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== HOSPITAL MANAGEMENT SYSTEM =====");

        System.out.print("Enter Patient ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Patient Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Disease : ");
        String disease = sc.nextLine();

        // CREATE PATIENT OBJECT
        Patient patient =
            new Patient(id, name, age, disease);

        // MVC
        HospitalView view = new HospitalView();

        HospitalController controller =
            new HospitalController(patient, view);

        // DISPLAY DATA
        controller.updateView();

        // DATABASE INSERT
        PatientDAO dao = new PatientDAO();

        dao.addPatient(patient);

        // VIEW ALL PATIENTS
        dao.viewPatients();

        sc.close();
    }
}