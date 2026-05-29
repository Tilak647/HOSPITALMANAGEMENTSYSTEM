
public class Patient {

    private int id;
    private String name;
    private int age;
    private String disease;

    // CONSTRUCTOR
    public Patient(int id,
    String name,
    int age,
    String disease) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
