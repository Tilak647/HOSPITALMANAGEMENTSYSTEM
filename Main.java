import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        Patient patient = new Patient(id, name, age, disease);

        HospitalView view = new HospitalView();

        HospitalController controller =
                new HospitalController(patient, view);

        controller.updateView();

        System.out.println("\n--- Update Patient Details ---");

        System.out.print("Enter New Name : ");
        String newName = sc.nextLine();

        System.out.print("Enter New Age : ");
        int newAge = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter New Disease : ");
        String newDisease = sc.nextLine();

        controller.setPatientName(newName);
        controller.setPatientAge(newAge);
        controller.setDisease(newDisease);

        controller.updateView();

        sc.close();
    }
}