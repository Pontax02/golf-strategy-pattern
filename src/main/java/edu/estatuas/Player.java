package edu.estatuas;

public class Player {

    private String initials;
    private byte handicap;
    public Player(String initials, byte handicap) {
        this.initials = initials;
        this.handicap = handicap;
    }
    public String getInitials() {
        return initials;
    }
    public byte getHandicap() {
        return handicap;
    }
}
