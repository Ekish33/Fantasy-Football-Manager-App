import java.util.ArrayList;

public class Team<E> {
    private E owner;
    private String teamID;
    private String teamName;
    private ArrayList<Player> players;
    private ArrayList<Player> bench;
    private ArrayList<Player> injuredReserve;
    private boolean cpuControlled;

    // Default constructor
    public Team() {
        this.owner = null;
        this.teamID = "";
        this.teamName = "";
        this.players = new ArrayList<>();
        this.bench = new ArrayList<>();
        this.injuredReserve = new ArrayList<>();
        this.cpuControlled = false;
    }

    // Parameterized constructor
    public Team(E owner, String teamID, String teamName, ArrayList<Player> players, 
                ArrayList<Player> bench, ArrayList<Player> injuredReserve, boolean cpuControlled) {
        this.owner = owner;
        this.teamID = teamID;
        this.teamName = teamName;
        this.players = players != null ? players : new ArrayList<>();
        this.bench = bench != null ? bench : new ArrayList<>();
        this.injuredReserve = injuredReserve != null ? injuredReserve : new ArrayList<>();
        this.cpuControlled = cpuControlled;
    }

    // Getters and Setters
    public E getOwner() {
        return owner;
    }

    public void setOwner(E owner) {
        this.owner = owner;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> getBench() {
        return bench;
    }

    public void setBench(ArrayList<Player> bench) {
        this.bench = bench;
    }

    public ArrayList<Player> getInjuredReserve() {
        return injuredReserve;
    }

    public void setInjuredReserve(ArrayList<Player> injuredReserve) {
        this.injuredReserve = injuredReserve;
    }

    public boolean isCpuControlled() {
        return cpuControlled;
    }

    public void setCpuControlled(boolean cpuControlled) {
        this.cpuControlled = cpuControlled;
    }

    // Adds a player to the team roster if there’s space
    public void addPlayer(Player player) {
        if (player != null && !players.contains(player)) {
            players.add(player);
        }
    }

    // Removes a player from the team roster
    public void dropPlayer(Player player) {
        players.remove(player);
    }

    // Swaps a player between the starting lineup and the bench
    public void swapPlayers(Player playerIn, Player playerOut) {
        if (players.contains(playerOut) && bench.contains(playerIn)) {
            players.remove(playerOut);
            bench.add(playerOut);
            bench.remove(playerIn);
            players.add(playerIn);
        }
    }

    // Allows modification of the lineup (basic implementation as placeholder)
    public void modifyLineup() {
        // Logic to modify the lineup based on user selection or auto-setting
        System.out.println("Lineup has been modified.");
    }

    // Checks if any player in the roster is injured
    public boolean isInjured() {
        for (Player player : players) {
            if (player.isInjured()) {
                return true;
            }
        }
        return false;
    }

    // Checks if a player is in the starting lineup
    public boolean isStarting(Player player) {
        return players.contains(player) && !bench.contains(player);
    }
}