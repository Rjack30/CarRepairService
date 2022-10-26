package model;

import java.sql.*;
public class Offices {
    private String city;
    public Offices (String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    public static void main () {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            Connection conn = DriverManager.getConnection(url,"root","JRack22!#");
            Statement st = conn.createStatement();
            st.executeUpdate("DROP TABLE IF EXISTS Office");
            st.executeUpdate("CREATE TABLE Office(\n" +
                    "    id INT AUTO_INCREMENT,\n" +
                    "    name VARCHAR(100),\n" +
                    "    offices_id INT," +
                    "    staff_number , " +
                    "    PRIMARY KEY (id)" +
                    ");"
            );
            st.executeUpdate("INSERT INTO Courthouse " +
                    "VALUES (1001, ' Burbank Office', 1 )");
            st.executeUpdate("INSERT INTO Office " +
                    "VALUES (1002, ' Glendale Office', 2)");
            st.executeUpdate("INSERT INTO Office " +
                    "VALUES (1003, ' Torrance Office', 3 )");

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

    public static void setUp() {
        String databaseURL = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "JRack22!#";
        connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Starting Connection to MYSQL Database");
            System.out.println("Connecting to Database...");
            connection = DriverManager.getConnection(databaseURL, user, password);
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void getOfficesFromDataBase() {
        try {
            String query = "select * from Courthouse";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){
                String name= rs.getString("name");
                System.out.println( name );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}





