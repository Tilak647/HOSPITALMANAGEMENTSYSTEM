

public class HospitalController {

    private Patient model;
    private HospitalView view;

    // Constructor
    public HospitalController(Patient model, HospitalView view) {
        this.model = model;
        this.view = view;
    }

    // Update Patient Name
    public void setPatientName(String name) {
        model.setName(name);
    }

    // Update Patient Age
    public void setPatientAge(int age) {
        model.setAge(age);
    }

    // Update Disease
    public void setDisease(String disease) {
        model.setDisease(disease);
    }

    // Display Patient
    public void updateView() {
        view.displayPatient(
                model.getId(),
                model.getName(),
                model.getAge(),
                model.getDisease()
        );
    }
}
