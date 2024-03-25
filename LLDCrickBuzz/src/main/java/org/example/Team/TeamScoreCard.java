package org.example.Team;

public class TeamScoreCard {
    private int totalScore;
    private int extras;
    private int totalFours;
    private int totalSix;

    public TeamScoreCard(){
        this.totalSix = 0;
        this.extras = 0;
        this.totalFours = 0;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public int getTotalFours() {
        return totalFours;
    }

    public void setTotalFours(int totalFours) {
        this.totalFours = totalFours;
    }

    public int getTotalSix() {
        return totalSix;
    }

    public void setTotalSix(int totalSix) {
        this.totalSix = totalSix;
    }

    @Override
    public String toString() {
        return "TeamScoreCard{" +
                "totalScore=" + totalScore +
                ", extras=" + extras +
                ", totalFours=" + totalFours +
                ", totalSix=" + totalSix +
                '}';
    }
}
