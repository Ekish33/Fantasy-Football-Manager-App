import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    private Connection connection;

    // Connect to the database
    public void connect() {
        try {
            // Set up the connection (replace with your DB credentials)
            String url = "jdbc:mysql://127.0.0.1:3306/mydb?user=root&password=JavaFantasy321!";  // Corrected this line
            String username = "root";
            String password = "JavaFantasy321!";
            
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Get player by ID
    public String getPlayerByID(String playerID) {
        String query = "SELECT playerName FROM players WHERE playerID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, playerID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("playerName");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


   

    // Close the connection to the database
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}