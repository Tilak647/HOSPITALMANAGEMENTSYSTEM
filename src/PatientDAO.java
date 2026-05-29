// ==========================
// FILE : PatientDAO.java
// ==========================

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientDAO {

    // INSERT DATA
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

    // DISPLAY DATA
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
}