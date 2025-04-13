package edu.estatuas;

public class ComputeCard {

    private final GolfPlay play;
    private final ScoreCard scoreCard;

    public ComputeCard( ScoreCard scoreCard,GolfPlay play) {
        this.scoreCard = scoreCard;
        this.play = play;
    }



    public void compute() {
        this.play.implementStrategy(this.scoreCard);
    }
}
