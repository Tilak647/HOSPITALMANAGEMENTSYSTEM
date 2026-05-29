
public class HospitalController {

    private Patient model;
    private HospitalView view;

    public HospitalController(Patient model,
    HospitalView view) {

        this.model = model;
        this.view = view;
    }

    public void setPatientId(int id) {
        model.setId(id);
    }

    public void setPatientName(String name) {
        model.setName(name);
    }

    public void setPatientAge(int age) {
        model.setAge(age);
    }

    public void setPatientDisease(String disease) {
        model.setDisease(disease);
    }

    public int getPatientId() {
        return model.getId();
    }

    public String getPatientName() {
        return model.getName();
    }

    public int getPatientAge() {
        return model.getAge();
    }

    public String getPatientDisease() {
        return model.getDisease();
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
