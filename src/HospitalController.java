// ==========================
// FILE : HospitalController.java
// ==========================

public class HospitalController {

    private Patient model;
    private HospitalView view;

    public HospitalController(
            Patient model,
            HospitalView view) {

        this.model = model;
        this.view = view;
    }

    public void setPatientName(String name) {
        model.setName(name);
    }

    public void setPatientAge(int age) {
        model.setAge(age);
    }

    public void setDisease(String disease) {
        model.setDisease(disease);
    }

    public void updateView() {

        view.displayPatient(
            model.getId(),
            model.getName(),
            model.getAge(),
            model.getDisease()
        );
    }
}