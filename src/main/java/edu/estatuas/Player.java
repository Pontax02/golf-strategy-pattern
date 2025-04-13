package edu.estatuas;

public class Player {

    private final String initials;
    private byte handicap  = 0;

    private short points = 0;
    private short score;

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
        return this.score;
    }

    void setPoints(int points) {
        this.points = (short) points;
    }
    short getpoints(){
        return this.points;
    }
    void setScore(int score) {
        this.score = (short) score;
    }

    public String toString() {
        return this.getInitials() + "---> H´cap: " + this.getHandicap() + " Strokes: " + this.getFinalScore() + " Stableford Points: " + this.getpoints() ;
    }
}
