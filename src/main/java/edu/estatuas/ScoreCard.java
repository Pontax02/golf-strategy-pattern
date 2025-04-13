package edu.estatuas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ScoreCard {
    Course course;

    Optional<Player> playerA = Optional.empty();
    Optional<Player> playerB = Optional.empty();
    Optional<Player> playerC = Optional.empty();
    Optional<Player> playerD = Optional.empty();

    public List<Holes> holes = new ArrayList<Holes>();

    public ScoreCard() {}

    public void setPlayerA(Player playerA) {
        this.playerA = Optional.of(playerA);
    }
    public void setPlayerB(Player playerB) {
        this.playerB = Optional.of(playerB);
    }
    public void setPlayerC(Player playerC) {
        this.playerC = Optional.of(playerC);
    }
    public void setPlayerD(Player playerD) {
        this.playerD = Optional.of(playerD);
    }
    public void setPlayersCourse(Course course) {
        this.course = course;
    }

    List<Player> getPlayers() {
        return Arrays.asList(playerA, playerB, playerC, playerD)
                .stream()
                .filter(player -> player.isPresent())
                .map(Optional::get)
                .toList();
    }
    public byte[] getPlayerCourse(Player player) {
        return this.course.getPlayerCourse(player);
    }

    public void addHoles(Byte[] holePar) {
        byte holeNumber = 1;
        for(Byte par : holePar) {
            this.holes.add(new Holes(holeNumber++, par));
        }
    }

    public int getNumHoles() {
        return this.holes.size();
    }

    public List<Holes> getHoles() {
        return this.holes;
    }

    public String toString(){
        return "test \t" + "\n";
    }
}
