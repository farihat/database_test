import java.sql.*;
import java.util.Scanner;

/**
 * Created by MARUKO on 28-Nov-15.
 */
public class LogIN_15 {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/users";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "hcc";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            Scanner scanner = new Scanner(System.in);
            System.out.print("enter id: ");
            int Id = scanner.nextInt();

            PreparedStatement statement = conn.prepareStatement("SELECT id FROM registration WHERE id = ?");
            statement.setInt(1, Id);

            ResultSet rs = statement.executeQuery();
            if(!rs.next() ){
                System.out.println("id not found , inserting...");
                statement = conn.prepareStatement("INSERT INTO Registration " +
                        "VALUES (?, 'Zara', 'Ali', 18)");
                statement.setInt(1,Id);
                statement.executeUpdate();
                System.out.println("Inserted records into the table...");
            }

            statement.close();

            conn.close();




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
