import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PatientDAO {

    // CREATE
    public void addPatient(Patient p) {

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                "INSERT INTO patients(id,name,age,disease) VALUES(?,?,?,?)";

            PreparedStatement pst =
                con.prepareStatement(sql);

            pst.setInt(1, p.getId());
            pst.setString(2, p.getName());
            pst.setInt(3, p.getAge());
            pst.setString(4, p.getDisease());

            int rows = pst.executeUpdate();

            if(rows > 0) {
                System.out.println("Patient Added Successfully");
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void viewPatients() {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM patients";

            PreparedStatement pst =
                con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            System.out.println("\n===== PATIENT RECORDS =====");

            while(rs.next()) {

                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("disease")
                );
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updatePatient(int id, String name,
                              int age, String disease) {

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                "UPDATE patients SET name=?, age=?, disease=? WHERE id=?";

            PreparedStatement pst =
                con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setString(3, disease);
            pst.setInt(4, id);

            int rows = pst.executeUpdate();

            if(rows > 0) {
                System.out.println("Patient Updated Successfully");
            }
            else {
                System.out.println("Patient ID Not Found");
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deletePatient(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                "DELETE FROM patients WHERE id=?";

            PreparedStatement pst =
                con.prepareStatement(sql);

            pst.setInt(1, id);

            int rows = pst.executeUpdate();

            if(rows > 0) {
                System.out.println("Patient Deleted Successfully");
            }
            else {
                System.out.println("Patient ID Not Found");
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}