package DBTest;

import java.sql.*;

public class dataBaseTest {
    public static void main(String[] args) {
        //we need url,username,password
        String url="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String username="syntax_hrm";
        String password="syntaxhrm123";

        try {
            //we need establish the connection to the database
           Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("connection is created for Batch15");
       //create a statement to send queries
            Statement statement=conn.createStatement();

            //when we send any query to database then db returns
            //result set (tables with rows and columns)
            ResultSet rset=statement.executeQuery("select FirstName,LastName from person");
            rset.next();

            String fName = rset.getString("FirstName");
            String lName = rset.getString("LastName");
            System.out.println(fName + " " + lName);

            rset.next();

             fName = rset.getString("FirstName");
             lName = rset.getString("LastName");
            System.out.println(fName + " " + lName);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
