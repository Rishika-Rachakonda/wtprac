import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "AMRUTHA";
    private static final String DB_NAME = "mydb";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);

            // Step 3: Execute a query to create database
            System.out.println("Creating database...");
            stmt = conn.createStatement();
            String sqlCreateDB = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;
            stmt.executeUpdate(sqlCreateDB);
            System.out.println("Database created successfully...");

            // Step 4: Use database
            String sqlUseDB = "USE " + DB_NAME;
            stmt.executeUpdate(sqlUseDB);
            System.out.println("Using database " + DB_NAME + "...");

            // Step 5: Create a table in the selected database
            String sqlCreateTable = "CREATE TABLE IF NOT EXISTS students ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(100) NOT NULL,"
                    + "age INT,"
                    + "city VARCHAR(100))";
            stmt.executeUpdate(sqlCreateTable);
            System.out.println("Table 'students' created successfully...");

            // Step 6: Insert records into the table
            String sqlInsert1 = "INSERT INTO students (name, age, city) VALUES ('Alice', 20, 'New York')";
            String sqlInsert2 = "INSERT INTO students (name, age, city) VALUES ('Bob', 22, 'Los Angeles')";
            stmt.executeUpdate(sqlInsert1);
            stmt.executeUpdate(sqlInsert2);
            System.out.println("Records inserted into 'students' table...");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Step 7: Close resources
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
