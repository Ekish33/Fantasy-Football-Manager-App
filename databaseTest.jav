public class databaseTest {
    public static void main(String[] args) {
        // Create an instance of DatabaseManager
        DatabaseManager dbManager = new DatabaseManager();

        // Connect to the database
        dbManager.connect();

        // Example usage of other methods
        String playerID = "1";
        String playerName = dbManager.getPlayerByID(playerID);
        System.out.println("Player Name: " + playerName);

        dbManager.close();
    }
}