public class Scoring {
    private double pointPerReception;
    private double pointsPerYd;
    private double pointPer2PointCon;
    private double pointPerRushingTd;
    private double pointPerPassingTd;
    private double pointPerRecievingTd;
    private double pointPerPAT;
    private double pointPerFieldGoal;
    private double defensiveTD;
    private double fumble;

    // Default constructor
    public Scoring() {
        this.pointPerReception = 0.0;
        this.pointsPerYd = 0.0;
        this.pointPer2PointCon = 0.0;
        this.pointPerRushingTd = 0.0;
        this.pointPerPassingTd = 0.0;
        this.pointPerRecievingTd = 0.0;
        this.pointPerPAT = 0.0;
        this.pointPerFieldGoal = 0.0;
        this.defensiveTD = 0.0;
        this.fumble = 0.0;
    }

    // Parameterized constructor
    public Scoring(double pointPerReception, double pointsPerYd, double pointPer2PointCon, 
                   double pointPerRushingTd, double pointPerPassingTd, double pointPerRecievingTd, 
                   double pointPerPAT, double pointPerFieldGoal, double defensiveTD, double fumble) {
        this.pointPerReception = pointPerReception;
        this.pointsPerYd = pointsPerYd;
        this.pointPer2PointCon = pointPer2PointCon;
        this.pointPerRushingTd = pointPerRushingTd;
        this.pointPerPassingTd = pointPerPassingTd;
        this.pointPerRecievingTd = pointPerRecievingTd;
        this.pointPerPAT = pointPerPAT;
        this.pointPerFieldGoal = pointPerFieldGoal;
        this.defensiveTD = defensiveTD;
        this.fumble = fumble;
    }

    // Getters
    public double getPointPerReception() {
        return pointPerReception;
    }

    public double getPointsPerYd() {
        return pointsPerYd;
    }

    public double getPointPer2PointCon() {
        return pointPer2PointCon;
    }

    public double getPointPerRushingTd() {
        return pointPerRushingTd;
    }

    public double getPointPerPassingTd() {
        return pointPerPassingTd;
    }

    public double getPointPerRecievingTd() {
        return pointPerRecievingTd;
    }

    public double getPointPerPAT() {
        return pointPerPAT;
    }

    public double getPointPerFieldGoal() {
        return pointPerFieldGoal;
    }

    public double getDefensiveTD() {
        return defensiveTD;
    }

    public double getFumble() {
        return fumble;
    }

    // Setters
    public void setPointPerReception(double pointPerReception) {
        this.pointPerReception = pointPerReception;
    }

    public void setPointsPerYd(double pointsPerYd) {
        this.pointsPerYd = pointsPerYd;
    }

    public void setPointPer2PointCon(double pointPer2PointCon) {
        this.pointPer2PointCon = pointPer2PointCon;
    }

    public void setPointPerRushingTd(double pointPerRushingTd) {
        this.pointPerRushingTd = pointPerRushingTd;
    }

    public void setPointPerPassingTd(double pointPerPassingTd) {
        this.pointPerPassingTd = pointPerPassingTd;
    }

    public void setPointPerRecievingTd(double pointPerRecievingTd) {
        this.pointPerRecievingTd = pointPerRecievingTd;
    }

    public void setPointPerPAT(double pointPerPAT) {
        this.pointPerPAT = pointPerPAT;
    }

    public void setPointPerFieldGoal(double pointPerFieldGoal) {
        this.pointPerFieldGoal = pointPerFieldGoal;
    }

    public void setDefensiveTD(double defensiveTD) {
        this.defensiveTD = defensiveTD;
    }

    public void setFumble(double fumble) {
        this.fumble = fumble;
    }
}

