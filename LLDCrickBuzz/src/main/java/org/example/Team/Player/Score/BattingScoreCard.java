package org.example.Team.Player.Score;

public class BattingScoreCard {
    private int totalRuns;
    private int bowlsPlayed;
    private int totalFours;
    private int totalSix;
    private int strikeRate;

    public BattingScoreCard(){
        this.totalSix = 0;
        this.bowlsPlayed = 0;
        this.strikeRate = 0;
        this.totalFours = 0;
        this.totalRuns =0;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getBowlsPlayed() {
        return bowlsPlayed;
    }

    public void setBowlsPlayed(int bowlsPlayed) {
        this.bowlsPlayed = bowlsPlayed;
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

    public int getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(int strikeRate) {
        this.strikeRate = strikeRate;
    }

    @Override
    public String toString() {
        return "BattingScoreCard{" +
                "totalRuns=" + totalRuns +
                ", bowlsPlayed=" + bowlsPlayed +
                ", totalFours=" + totalFours +
                ", totalSix=" + totalSix +
                ", strikeRate=" + strikeRate +
                '}';
    }
}
