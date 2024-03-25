package org.example.Team.Player.Score;

public class BowlingScoreCard {
    private int totalOverBowled;
    private int runsGiven;
    private int wicketTaken;
    private double economy;

    public BowlingScoreCard(){
        this.totalOverBowled = 0;
        this.runsGiven = 0;
        this.wicketTaken = 0;
        this.economy = 0.0;
    }

    public int getTotalOverBowled() {
        return totalOverBowled;
    }

    public void setTotalOverBowled(int totalOverBowled) {
        this.totalOverBowled = totalOverBowled;
    }

    public int getRunsGiven() {
        return runsGiven;
    }

    public void setRunsGiven(int runsGiven) {
        this.runsGiven = runsGiven;
    }

    public int getWicketTaken() {
        return wicketTaken;
    }

    public void setWicketTaken(int wicketTaken) {
        this.wicketTaken = wicketTaken;
    }

    public double getEconomy() {
        return economy;
    }

    public void setEconomy(double economy) {
        this.economy = economy;
    }
}
