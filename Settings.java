import java.util.List;

public class Settings {
    private int rosterSize;
    private int minTeamPlayers;
    private int maxTeamPlayers;
    private List<String> positionRequirements;
    private int benchSlots;
    private int injuredReserveSlots;
    private Scoring scoring;

    // Default constructor
    public Settings() {
        this.rosterSize = 0;
        this.minTeamPlayers = 0;
        this.maxTeamPlayers = 0;
        this.positionRequirements = null;
        this.benchSlots = 0;
        this.injuredReserveSlots = 0;
        this.scoring = new Scoring();  // Initializing Scoring as a new Scoring object
    }

    // Parameterized constructor
    public Settings(int rosterSize, int minTeamPlayers, int maxTeamPlayers, 
                    List<String> positionRequirements, int benchSlots, 
                    int injuredReserveSlots, Scoring scoring) {
        this.rosterSize = rosterSize;
        this.minTeamPlayers = minTeamPlayers;
        this.maxTeamPlayers = maxTeamPlayers;
        this.positionRequirements = positionRequirements;
        this.benchSlots = benchSlots;
        this.injuredReserveSlots = injuredReserveSlots;
        this.scoring = scoring != null ? scoring : new Scoring();
    }

    // Getters
    public int getRosterSize() {
        return rosterSize;
    }

    public int getMinTeamPlayers() {
        return minTeamPlayers;
    }

    public int getMaxTeamPlayers() {
        return maxTeamPlayers;
    }

    public List<String> getPositionRequirements() {
        return positionRequirements;
    }

    public int getBenchSlots() {
        return benchSlots;
    }

    public int getInjuredReserveSlots() {
        return injuredReserveSlots;
    }

    public Scoring getScoring() {
        return scoring;
    }

    // Setters
    public void setRosterSize(int rosterSize) {
        this.rosterSize = rosterSize;
    }

    public void setMinTeamPlayers(int minTeamPlayers) {
        this.minTeamPlayers = minTeamPlayers;
    }

    public void setMaxTeamPlayers(int maxTeamPlayers) {
        this.maxTeamPlayers = maxTeamPlayers;
    }

    public void setPositionRequirements(List<String> positionRequirements) {
        this.positionRequirements = positionRequirements;
    }

    public void setBenchSlots(int benchSlots) {
        this.benchSlots = benchSlots;
    }

    public void setInjuredReserveSlots(int injuredReserveSlots) {
        this.injuredReserveSlots = injuredReserveSlots;
    }

    public void setScoring(Scoring scoring) {
        this.scoring = scoring;
    }
}