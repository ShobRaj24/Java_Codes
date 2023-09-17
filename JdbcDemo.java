package Shob_RAj;
import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:33060/first"; // Replace 'mydatabase' with your database name
        String username = "root"; // Replace 'your_username' with your database username
        String password = "9141639744"; // Replace 'your_password' with your database password

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Register the JDBC driver (if not using JDBC 4.0+)
            // Class.forName("com.mysql.cj.jdbc.Driver"); // Uncomment this line for MySQL

            // Step 2: Open a connection
            connection = DriverManager.getConnection(url, username, password);

            // Rest of your code to execute the query and process the result set...
            // (The previous code you had to retrieve data from the database)
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Clean up resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


