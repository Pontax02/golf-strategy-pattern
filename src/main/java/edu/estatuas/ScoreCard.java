package edu.estatuas;

import java.util.Optional;

public class ScoreCard {
    Course course;

    Optional<Player> playerA = Optional.empty();
    Optional<Player> playerB = Optional.empty();
    Optional<Player> playerC = Optional.empty();
    Optional<Player> playerD = Optional.empty();

    public ScoreCard() {

    }

    public void setPlayerA(Player playerA) {
        this.playerA = Optional.ofNullable(playerA);
    }
    public void setPlayerB(Player playerB) {
        this.playerB = Optional.ofNullable(playerB);
    }
    public void setPlayerC(Player playerC) {
        this.playerC = Optional.ofNullable(playerC);
    }
    public void setPlayerD(Player playerD) {
        this.playerD = Optional.ofNullable(playerD);
    }
    public void setPlayersCourse(Course course) {
        this.course = course;
    }



    public String toString(){
        return "s";
    }

    public Optional<Player> getPlayerA() {
        return playerA;
    }

    public Optional<Player> getPlayerB() {
        return playerB;
    }

    public Optional<Player> getPlayerC() {
        return playerC;
    }

    public Optional<Player> getPlayerD() {
        return playerD;
    }
}
