/**
 * Created by MARUKO on 26-Nov-15.
 */

import java.sql.*;
import java.text.MessageFormat;


// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class asdf {

    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/test";
    public static final String JDBC_USER ="root";
    public static final String JDBC_PASSWORD ="hcc";

    public static void main(String[] args) throws SQLException , ClassNotFoundException{
        Statement statement = null;
        try{
            Class.forName(JDBC_DRIVER);

            Connection connection = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
            statement =  connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT ID, firstname, lastname, email"+"from customer");
            System.out.println("First Name\tLast Name\tE-mail");
            int count= 0;
            while (rs.next()){
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");
                System.out.printf("%s\t%s\t%s\n",firstname,lastname,email);
                count++;
            }
            System.out.println("--");
            System.out.println(MessageFormat.format("Rows: (0)",count));



        }finally {
            if(statement!=null)
                statement.close();

        }
    }
}

