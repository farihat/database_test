import java.sql.*;

/**
 * Created by MARUKO on 27-Nov-15.
 */
public class CallableStatement_13 {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/USERS";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "hcc";

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating statement...");
            String sql = "{call getFullName(?, ?, ?)}";
            stmt = conn.prepareCall(sql);

            //Bind values into the parameters.
            stmt.setInt(1,15);
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(3, java.sql.Types.VARCHAR);

            //ResultSet rs = stmt.executeQuery();
            stmt.executeUpdate();

            String firstName = stmt.getString(2);
            String lastName = stmt.getString(3);

            System.out.println(firstName+lastName
            );

            //STEP 6: Clean-up environment

            stmt.close();
            conn.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
