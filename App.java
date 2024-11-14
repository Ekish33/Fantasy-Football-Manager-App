public class App {
    public static void main(String[] args) throws Exception {
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
