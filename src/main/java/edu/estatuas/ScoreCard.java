package edu.estatuas;

import java.util.Optional;

public class ScoreCard {
    Course course;
    Optional<String> players = Optional.empty() ;
    public ScoreCard() {

    }

    public void setPlayerA(Player playerA) {
        this.players = Optional.ofNullable(playerA.getInitials());
    }
    public void setPlayerB(Player playerB) {
        this.players = Optional.ofNullable(playerB.getInitials());
    }
    public void setPlayersCourse(Course course) {
        this.course = course;
    }
}
