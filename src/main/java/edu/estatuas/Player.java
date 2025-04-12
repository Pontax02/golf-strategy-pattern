package edu.estatuas;

public class Player {

    private final String initials;
    private byte handicap  = 0;
    public int finalScore;
    public Player(String initials, byte handicap) {
        this.initials = initials;
        this.handicap = handicap;

    }
    public String getInitials() {
        return this.initials;
    }
    public byte getHandicap() {
        return this.handicap;
    }
    public int getFinalScore() {
        return this.finalScore;
    }
    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public String toString() {
        return this.getInitials() + "---> H´cap: " + this.getHandicap() + " Strokes: " + this.getFinalScore() ;
    }
}
