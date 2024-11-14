import java.util.LinkedHashMap;

public class Match<E> {

    private String matchID;
    private String homeTeam;
    private String awayTeam;
    private E playerStats;
    private LinkedHashMap<String, Double> score; // LinkedHashMap for storing team scores
    private LinkedHashMap<Player, PlayerStats> stats; // LinkedHashMap for storing player stats
    
    // Constructor
    public Match(String matchID, String homeTeam, String awayTeam) {
        this.matchID = matchID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = new LinkedHashMap<>();
        this.stats = new LinkedHashMap<>();
    }

    // Getters and Setters
    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public LinkedHashMap<String, Double> getScore() {
        return score;
    }

    public void setScore(LinkedHashMap<String, Double> score) {
        this.score = score;
    }

    public LinkedHashMap<Player, PlayerStats> getStats() {
        return stats;
    }

    public void setStats(LinkedHashMap<Player, PlayerStats> stats) {
        this.stats = stats;
    }

    // Add or update score for a team
    public void addScore(String team, Double points) {
        this.score.put(team, points);
    }

    // Add or update player stats
    public void addPlayerStats(Player player, PlayerStats playerStats) {
        this.stats.put(player, playerStats);
    }

    @Override
    public String toString() {
        return "Match ID: " + matchID +
                "\nHome Team: " + homeTeam +
                "\nAway Team: " + awayTeam +
                "\nScore: " + score +
                "\nStats: " + stats;
    }
}