
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientDAO dao = new PatientDAO();

        while (true) {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Update Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

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

                    // CREATE OBJECT
                    Patient patient =
                            new Patient(id, name, age, disease);

                    // MVC
                    HospitalView view =
                            new HospitalView();

                    HospitalController controller =
                            new HospitalController(patient, view);

                    // DISPLAY
                    controller.updateView();

                    // INSERT INTO DATABASE
                    dao.addPatient(patient);

                    break;

                case 2:

                    dao.viewPatients();

                    break;

                case 3:

                    System.out.print("Enter Patient ID to Update : ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name : ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age : ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Disease : ");
                    String newDisease = sc.nextLine();

                    dao.updatePatient(
                            updateId,
                            newName,
                            newAge,
                            newDisease
                    );

                    break;

                case 4:

                    System.out.print("Enter Patient ID to Delete : ");
                    int deleteId = sc.nextInt();

                    dao.deletePatient(deleteId);

                    break;

                case 5:

                    System.out.println("Thank You");

                    sc.close();

                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}