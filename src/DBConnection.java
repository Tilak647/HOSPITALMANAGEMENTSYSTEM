import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database Connection
con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/hospitaldb",
    "admin",
    "Admin@123"
);

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
    }
}