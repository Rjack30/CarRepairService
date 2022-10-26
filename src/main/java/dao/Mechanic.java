package dao;
import java.sql.*;
public class Mechanic {

    private String name;
    public Mechanic (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    public static void main () {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            Connection conn = DriverManager.getConnection(url,"root","JRack22!#");
            Statement st = conn.createStatement();
            st.executeUpdate("DROP TABLE IF EXISTS Mechanic");
            st.executeUpdate("CREATE TABLE Attorney (\n" +
                    "    id INT AUTO_INCREMENT,\n" +
                    "    first_name VARCHAR(255) NOT NULL,\n" +
                    "    last_name VARCHAR(45) NOT NULL,\n" +
                    "    phone_number VARCHAR(45) NOT NULL,\n" +
                    "    email VARCHAR(45) NOT NULL,\n" +
                    "    Customers_id INT NOT NULL,\n" +
                    "    Offices_idOffices INT NOT NULL,\n" +
                    "    Reviews_idReviews INT NOT NULL, \n" +
                    "    PRIMARY KEY (id)\n" +
                    ");"

            );
            st.executeUpdate("INSERT INTO Mechanic " +
                    "VALUES (1002, 'Will', 'Wright', 'Motor Doctor', 'Engine', 'Burbank', '300' )");
            st.executeUpdate("INSERT INTO Mechanic " +
                    "VALUES (1003, 'Robert', 'Earl', 'Brake Service', 'Brakes', 'Burbank', '500' )");
            st.executeUpdate("INSERT INTO Mechanic " +
                    "VALUES (1004, 'Tim', 'Bonner', 'Suspension Service', 'Suspension', 'Burbank', '100' )");

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

    public static void getAttorneysFromDataBase() {
        try {
            String query = "select * from Mechanic";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){
                int Id= rs.getInt("Id");
                String first_name= rs.getString("first_Name");
                String last_name= rs.getString("last_Name");
                String service = rs.getString("service");
                String Office_id = rs.getString("Office_id");
                System.out.println(Id+ " , "+ first_name + " " + last_name + " , " + service + " , " + Office_id);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}