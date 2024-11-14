import java.util.*;
public class Player {
    // Attributes
    private String playerID;
    private String playerName;
    private String teamName;
    private double projectedPoints;
    private double generatedPoints;
    private boolean isFreeAgent;
    private boolean isInjured;

    // Default constructor
    public Player() {
        this.playerID = null;
        this.playerName = null;
        this.teamName = null;
        this.projectedPoints = 0;
        this.generatedPoints = 0;
        this.isFreeAgent = false;
        this.isInjured = false;
    }

    // Parameterized constructor
    public Player(String playerID, String playerName, String teamName, double projectedPoints, 
                  double generatedPoints, boolean isFreeAgent, boolean isInjured) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.teamName = teamName;
        this.projectedPoints = projectedPoints;
        this.generatedPoints = generatedPoints;
        this.isFreeAgent = isFreeAgent;
        this.isInjured = isInjured;
    }

    // Getters
    public String getPlayerID() {
        return playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public boolean isFreeAgent() {
        return isFreeAgent;
    }

    public double getProjectedPoints() {
        return projectedPoints;
    }

    public double getGeneratedPoints() {
        return generatedPoints;
    }

    // Setters
    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setProjectedPoints(double projectedPoints) {
        this.projectedPoints = projectedPoints;
    }

    public void setGeneratedPoints(double generatedPoints) {
        this.generatedPoints = generatedPoints;
    }

    public void setInjuryStatus(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public void setFreeAgentStatus(boolean isFreeAgent) {
        this.isFreeAgent = isFreeAgent;
    }

    // Method to update both projected and generated points
    public void updatePoints(double projected, double generated) {
        this.projectedPoints = projected;
        this.generatedPoints = generated;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Player{" +
                "playerID='" + playerID + '\'' +
                ", playerName='" + playerName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", projectedPoints=" + projectedPoints +
                ", generatedPoints=" + generatedPoints +
                ", isFreeAgent=" + isFreeAgent +
                ", isInjured=" + isInjured +
                '}';
    }
}

