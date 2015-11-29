/**
 * Created by MARUKO on 27-Nov-15.
 */

import java.sql.*;

public class PreparedStatement_12 {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/USERS";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "hcc";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating statement...");
            String sql = "UPDATE registration set first=? WHERE id=?";
            stmt = conn.prepareStatement(sql);

            //Bind values into the parameters.
            stmt.setString(1,"fariha");
            stmt.setInt(2,10);

            // Let us update age of the record with ID = 102;
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows );

            if(rows == 0){
                sql = "INSERT INTO Registration " +
                        "VALUES (10, 'Zara', 'Ali', 18)";
                stmt.executeUpdate(sql);
            }

            // Let us select all the records and display them.
            sql = "SELECT id, first, last, age FROM registration";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
