package edu.estatuas;

public class Player {

    private final String initials;
    private final byte handicap;
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
}
